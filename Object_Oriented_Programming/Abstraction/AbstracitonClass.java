package oops.Abstraction;

public class AbstracitonClass {
    public static void main(String[] args) {
        Car obj1 = new Petrol();
        obj1.refual();
        obj1.engine();
        Car obj2 = new Ev();
        obj2.refual();
        obj2.engine(); 
    }
}
abstract class Car{
    int num;
    abstract void refual();
    abstract void engine();
}
class Petrol extends Car{
    void refual(){
        System.out.println("refual is done by petrol");
    }
    void engine(){
        System.out.println("its a petrol type engine");
    }
}
class Ev extends Car{
    void refual(){
        System.out.println("refual is done by Charge");
    }
    void engine(){
        System.out.println("its a electric car");
    }
}