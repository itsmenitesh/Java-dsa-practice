package oops;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    int userId;
    String userName;
    int userAge;



    User(int userId , String userName, int userAge){
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }
//     int getUserId(){
//        return this.userId;
//     }
//     String getUserName(){
//        return this.userName;
//     }
//     int getUserAge(){
//        return this.userAge;
//     }


    @Override
    public String toString(){
        return "Users{" +
                "Id = " + userId +
                ", Name = " + userName +
                ", Age = " + userAge +
                "}";
    }
}

class UserIdCompare implements Comparator<Users>{

    @Override
    public int compare(Users o1 , Users o2){
        return o1.userId-o2.userId;
    }
}
class userName implements Comparator<Users>{
    @Override
    public int compare(Users o1 , Users o2){
        return  o1.userName.compareTo(o2.userName);
    }
}
public class ComparatorData {
    public static void main(String [] args){
        ArrayList<Users> al = new ArrayList<>();
        al.add(new Users(1,"Nitesh" ,25));
        al.add(new Users(3,"User1" ,24));
        al.add(new Users(2,"User2" ,23));
        System.out.println(al);
        Collections.sort(al,new UserIdCompare());
        System.out.println(al);
        Collections.sort(al,new userName());
        System.out.println(al);



    }
}

