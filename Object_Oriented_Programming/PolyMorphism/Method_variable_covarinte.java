package oops.PolyMorphism;

class User{
    int name;
    
    public static  void nameF(){
        System.out.println("this is parent class");
    }
    private void privName(){
        System.out.println("this is parents private  class");
    }
    public void privCall(){
        this.privName();
    }
    
    public void overloadName(String n){
        System.out.println("i am parents class one prameter function");
    }
}
class  RegisterUser extends User{
    String locaton;
    static public void nameF(){
        System.out.println("this is child class");
    }
    
    private void privName(){
        System.out.println("this is child private  class");
    }
    public void privCall(){
        this.privName();
    }
    
    public void overloadName(){
        System.out.println("i am child class zero prameter function");
    }
}

public class Method_variable_covarinte {
    public static void main(String[] args) {
          User obj = new User();
        // RegisterUser obj = new RegisterUser();
        // User obj = new RegisterUser();
        // RegisterUser obj = new User();
        obj.overloadName();
    }
    
}
