package oops.encapsulation;

public class class_object {
    public static void main(String[] args) {
        Co obj1 = new Co("Nitesh" ,5 ,1000000 );
        obj1.obj();

    }
}
class Co{
    String name;
    int rating ;
    int view;
    
    public Co(String name , int rating , int view){
        this.name=name;
        this.rating=rating;
        this.view=view;
    }
    public void obj(){
        System.out.println(this.name);
        System.out.println(this.rating);
        System.out.println(this.view);
    }
}

