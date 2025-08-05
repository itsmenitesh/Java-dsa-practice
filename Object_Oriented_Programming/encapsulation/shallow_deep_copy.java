package oops.encapsulation;

public class shallow_deep_copy {
    public static void main(String []args){
        Sdc actor = new Sdc();
        System.out.println(actor.name +" "+ actor.rating+" "+actor.view);
        Sdc actorCopy = actor;  //shallow copy.
        System.out.println(actorCopy.name+" "+actorCopy.rating+" "+actorCopy.view);
        // actor.rating = 10;   
        // actorCopy.view=10000;

        // System.out.println(actor.name +" "+ actor.rating+" "+actor.view);
        // // Sdc actorCopy = actor;
        // System.out.println(actorCopy.name+" "+actorCopy.rating+" "+actorCopy.view);
        Sdc deepCopy = new Sdc(actor);
        System.out.println(deepCopy.name+" "+ deepCopy.rating+" "+deepCopy.view); //deepCopy.

    }
}
class Sdc{
    String name = "Nitesh Choudhary";
    int rating = 5;   //default setup
    int view = 50000;
    
    Sdc(){}
    Sdc(Sdc other){
        this.name=other.name;
        this.rating=other.rating;
        this.view=other.view;
    }
}

