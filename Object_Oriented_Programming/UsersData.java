package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class UserData {
    int userId;
    String category;
    String status;
    String name;
    public UserData(int userId, String category, String status, String name) {
        this.userId = userId;
        this.category = category;
        this.status = status;
        this.name = name;
    }
    public String toString() {
        return "UserId: " + userId + ", Category: " + category + ", Status: " + status + ", Name: " + name;
    }
}
class categoryData implements Comparator<UserData>{

    @Override
    public int compare(UserData o1 , UserData o2){
        return o1.category.compareTo(o2.category);
    }
}
public class UsersData {
    public static void main(String[] args) {
        // Create a list of UserData
        List<UserData> userDataList = new ArrayList<>();
        userDataList.add(new UserData(1, "Client", "Valid", "Alice"));
        userDataList.add(new UserData(2, "Employee", "Rejected", "Bob"));
        userDataList.add(new UserData(3, "Client", "Invalid", "Carol"));
        userDataList.add(new UserData(4, "Employee", "Valid", "David"));
        userDataList.add(new UserData(5, "Client", "Rejected", "Eve"));
        // Remove UserData objects with "Rejected" status
        userDataList.removeIf(userData -> "Rejected".equals(userData.status));
        // Sort the remaining UserData objects by category and name
        Collections.sort(userDataList , new categoryData());
        System.out.println(userDataList);
        // Print the sorted and filtered UserData objects
        for (UserData userData : userDataList) {
            System.out.println(userData);
        }
    }
}