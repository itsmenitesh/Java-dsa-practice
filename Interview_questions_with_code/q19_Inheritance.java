import java.util.*;
class Student{
    String name;
    String skill;
    Student(String name , String skill){
        this.name = name;
        this.skill = skill;
    }

    public void name(){
        System.out.println("My Name is "+name);
    }
    public void skills(){
        System.out.println("I am a "+skill);
    }
}
class Employee extends Student{
    String company;

    Employee(String name , String skill , String company){
        super(name, skill);
        this.company = company;
    }

    public void company(){
        System.out.println("i work in "+company);
    }
}

public class q19_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("PLease Enter Your Skill : ");
        String skill = sc.nextLine();
        System.out.println("PLease Enter Your company : ");
        String company = sc.nextLine();

        Employee em = new Employee(name , skill , company);
        em.name();
        em.skills();
        em.company();

    }
}
