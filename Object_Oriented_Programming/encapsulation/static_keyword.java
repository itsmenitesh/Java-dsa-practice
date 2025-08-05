package oops.encapsulation;

class Stat{
    static String name="Nitesh Choudhary";
    int rating;
    int view;

    Stat(int rating , int view){
        this.rating=rating;
        this.view=view;
    }
}
public class static_keyword {
    public static void main(String[] args) {
        Stat actor = new Stat(100,200);
        System.out.println(actor.name); // by making object.
                //or
        System.out.println(Stat.name); // direct by class name.
    }
}
