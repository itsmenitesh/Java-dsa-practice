package oops.PolyMorphism;


// Real life example
class User{
    String name;
    String location;
    // User(){
    //     this.name="Nitesh Choudhary";
    //     this.location="Siliguri";
    // }
    public User(String name , String location){
        this.name=name;
        this.location=location;
    }
    public void bookMyShow(){
        System.out.println(this.name+" "+this.location);
        System.out.println("Sorry! you are not register or Sign Up");
        System.out.println("Please login or Register");
    }
}
class RegisterUser extends User{
    String email;
    long phoneNo;
//    public  RegisterUser(){
//         this.email="niteshchoudhary1217@gmail.com";
//         this.phoneNo=7478529845l;
//     }
    public RegisterUser(String name , String location,String email , long phoneNo){
        super(name, location);
        this.email=email;
        this.phoneNo=phoneNo;
    }
    public void bookMyShow(){
        System.out.print(super.name+" "+super.location+" "+this.email+" "+this.phoneNo);
        System.out.print("you can book the tickets");
        System.out.print("Selects number of tickets");
    }
}
class method_overriding {
     public static void main(String[] args) {
        // User obj = new User("null", "null");
        // obj.bookMyShow();
        // RegisterUser obj = new RegisterUser("null", "null", "null", 0);
        RegisterUser obj = new RegisterUser("null", "null", "null", 0L); // Note the '0L' instead of '0'

        obj.bookMyShow();

     }

}

