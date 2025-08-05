package oops;


import java.util.ArrayList;
import java.util.Collections;

class Users implements Comparable<Users>{
    int userId;
    String userName;
    int userAge;



    Users(int userId , String userName, int userAge){
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }

    @Override
    public int compareTo(Users o){
        return this.userId-o.userId;
    }

    @Override
    public String toString(){
        return "Users{" +
                "Id = " + userId +
                ", Name = " + userName +
                ", Age = " + userAge +
                "}";
    }
}
public class ComparableData {
    public static void main(String [] args){
        ArrayList<Users> al = new ArrayList<>();
        al.add(new Users(1,"Nitesh" ,25));
        al.add(new Users(3,"User1" ,24));
        al.add(new Users(2,"User2" ,23));
        Collections.sort(al);
        System.out.println(al);



    }
}
