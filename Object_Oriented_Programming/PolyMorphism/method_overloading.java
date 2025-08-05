package oops.PolyMorphism;

class User{
    String name;
    public void fullname(String firstName , String middleName , String lastName){
        name = firstName +" "+ middleName +" "+lastName;
    }
    public void fullname(String firstName , String lastName){
        name = firstName+" "+lastName;
    }
    public void fullname(String firstName){     
        name = firstName;
    }
    public void fullname(char firstName , char middleName , String lastName){
        name = firstName +"."+ middleName +"."+lastName;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        User obj1 = new User();
        obj1.fullname("Nitesh", "kumar" , "choudhary");
        System.out.println(obj1.name);

        User obj2 = new User();
        obj2.fullname("Nitesh", "Choudhary");

        User obj3 = new User();
        obj3.fullname("Nitesh");
        System.out.println(obj3.name);

        User obj4 = new User();
        obj4.fullname('N', 'K' , "choudhary");
        System.out.println(obj4.name);

    }
}

