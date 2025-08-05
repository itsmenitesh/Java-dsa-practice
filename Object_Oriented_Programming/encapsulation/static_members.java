package oops.encapsulation;
import java.util.*;

class StatM{
   static String name="Nitesh Choudhary";
   private int rating=100;
   private int view=200;
    public void getName(){          //non-static
        System.out.println(this.rating+ " " + this.view);
        System.out.println(name);           
    }
    public static void getNameS(){  // static//basically we need to create and object in the function to call non static properties.
        StatM actor2 = new StatM();
        System.out.println(actor2.rating+ " " + actor2.view);        
        System.out.println("this is getNameS");
       
        System.out.println(name);
    }

}
public class static_members {
    public static void main(String[] args) {
        StatM actor = new StatM();
        actor.getName();
        StatM.getNameS();
    }
}
