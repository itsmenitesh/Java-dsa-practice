package oops.inheritance;

//parents class
class User{    
    String name;
    String location;
    public User(String name , String location){
        this.name=name;
        this.location=location;
    }
    public User(){
        this.name="Nitesh Choudhary";
        this.location="Siliguri";
    }
    public void classType(){
        System.out.println("Hey, i am parent class");
    }
    public void showList(){
        System.out.println("Yes! i can see the movies list");
    }

}

// SIngle level Inheritance
class regsiterUser extends User{                 
    String email;
    long phoneNo;
    public regsiterUser(String email , long phoneNo){
        this.email=email;
        this.phoneNo=phoneNo;
    }
    public void classType1(){
        System.out.println("Hey, i am child class extended User class");
    }
    public regsiterUser(){
        this.email="niteshchoudhary1217@gmail.com";
        this.phoneNo=7478529845l;
    }
    public void bookTicket(){
        System.out.print("Yes! i can book tickets");
    }
}
//Multipile Inheritance
class primiumUser extends regsiterUser{         
    String subcripitonType;
    String duration;
    public primiumUser(){
        this.subcripitonType="Mobile";
        this.duration="1 Year";
    }
    public primiumUser(String subcripitonType , String duration){
        this.subcripitonType=subcripitonType;
        this.duration=duration;
    }
    public void classType2(){
        System.out.print("Hey i am Multiple class");
    }
    public void primiumCustomer(){
        System.out.println("Yay! i am a primum customer");
    }
}

//Heirarical Inhritance with resgisterUSer
class Staff extends User{    
    int staffId;
    String theaterName;
    String Shift;
    public Staff(){
        this.staffId=747852;
        this.theaterName="Inox";
        this.Shift="Morning";
    }
    public Staff(int staffId , String theaterName , String shift){
        this.staffId=staffId;
        this.theaterName=theaterName;
        this.Shift=shift;
    }
    public void classType3(){
        System.out.println("Hey! i am Hybrid class with partenr of registerUser class");
    }
    public void staffShow(){
        System.out.println("Yes as a staff i can watch ther shows for FREE!!!!");
    }
}


public class Inheritance {
   public static void main(String[] args) {
        // prarents class
        User obj1 = new User("Geekster" , "India"); 
        obj1.classType();
        System.out.println(obj1.name+" "+obj1.location);
        obj1.showList();

        // single level inheritance
        regsiterUser obj2 = new regsiterUser(); 
        obj2.classType1();
        System.out.println(obj2.name+" "+obj2.location +" "+obj2.email+" "+obj2.phoneNo);
        obj2.showList();
        obj2.bookTicket();

        //multiple Inheritance
        primiumUser obj3 = new primiumUser("phone and desktop", "5 Years"); 
        obj3.classType2();
        System.out.println(obj3.name+" "+obj3.location+" "+obj3.email+" "+obj3.phoneNo+" "+obj3.subcripitonType+" "+obj3.duration);
        obj3.showList();
        obj3.bookTicket();
        obj3.primiumCustomer();

        //Heirarical Inhritance with resgisterUSer
        Staff obj4 = new Staff(9845, "Carnival", "Night");
        obj4.classType3();
        System.out.println(obj4.name+" "+obj4.location+" "+obj4.staffId+" "+obj4.theaterName+" "+obj4.Shift);
        obj4.showList();
        obj4.staffShow();

   }
}

