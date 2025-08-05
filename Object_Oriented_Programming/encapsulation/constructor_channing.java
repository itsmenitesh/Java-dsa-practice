package oops.encapsulation;

class Chaning{
    int length;
    int breadth;
    int height;
    String name;
    Chaning(){
        // this.length=1;
        // this.breadth=1;
        // this.height=1;
        this(1);      //constructor chaning
        System.out.println("0 parameter Construcor");
    }
    Chaning(int side){
        // this.length=side;
        // this.breadth=side;
        // this.height=side;
        this(side , side);  //constructor chaning
        System.out.println("1 parameter Construcor");
    }

    Chaning(int length , int breadth){
        // this.length=length;
        // this.breadth=breadth;
        // this.height=1;
        this(length , breadth , 1);   //constructor chaning
        System.out.println("2 parameter Construcor");
    }
    Chaning(int length , int breadth , int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        // System.out.println("3 parameter Construcor");
    }

}

public class constructor_channing {
    public static void main(String[] args) {
    Chaning prameter1 = new Chaning();
    Chaning prameter2 = new Chaning(10);
    Chaning parameter3 = new Chaning(10 , 20);
    Chaning parameter4 = new Chaning(10 ,20 ,30);

    
    System.out.println(prameter1.length+" "+ prameter1.breadth+" "+prameter1.height);
    System.out.println(prameter2.length+" "+ prameter2.breadth+" "+prameter2.height);
    System.out.println(parameter3.length+" "+ parameter3.breadth+" "+parameter3.height);
    System.out.println(parameter4.length+" "+ parameter4.breadth+" "+parameter4.height);
    
    }

}

