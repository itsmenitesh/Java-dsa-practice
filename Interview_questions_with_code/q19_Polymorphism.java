import java.util.Scanner;

class person{
    String name;
    int age;

    person(String name , int age){
        this.name = name;
        this.age = age;
    }
    public void name(){
        System.out.println("My Name is "+name);
    }
    public void age(){
        System.out.println("I am "+age+" years old");
    }

    public void Behaviour(){
        System.out.println("i always try do some creativity ");
    }
    public void Behaviour(String situation){
        System.out.println("In this " + situation + " situation, I behave differently.");
    }

}
class family extends  person{
    family(String name , int age){
        super(name, age);
    }

    public void Behaviour(){
        System.out.println("i feel happy and enjoyable when i am with my friends");
    }

}
class work extends person{
    work(String name , int age){
        super(name, age);
    }

    public void Behaviour(){
        System.out.println("i feel more excited to learning new things");
    }
}

public class q19_Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("PLease Enter Your age : ");
        int age = sc.nextInt();

        person alone = new person(name , age);
        alone.name();
        alone.age();
        alone.Behaviour();
        alone.Behaviour("Alone");
        family family = new family(name,age);

        family.Behaviour();
        work work = new work(name , age);
        work.Behaviour();
    }
}
