package oops.encapsulation;
import java.util.*;
public class constructor {
    
}
class cons{
    String name;
    int rating;
    int views;
    
    public cons(){} // default implicit constructor.
    public cons(){
        name = "nitesh choudhary";
        rating = 5;                 // default explicit constructor.
        views = 500000;
    }
    public cons(String  name, int rating , int view){
        this.name=name;
        this.rating=rating;     //parameter constructor.
        this.views=view;
    }
    public cons(cons other){
        setname(other.name); // copy consturctor.
    }

}
