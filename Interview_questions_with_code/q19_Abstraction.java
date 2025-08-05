abstract class Car{
    abstract void refuel();
    abstract void engine();
}
class Petrol extends Car{

    void refuel(){
        System.out.println("refuel is done by petrol");
    }
    void engine(){
        System.out.println("its a petrol type engine");
    }
}
class Ev extends Car{
    void refuel(){
        System.out.println("refuel is done by Charge");
    }
    void engine(){
        System.out.println("its a electric car");
    }
}

public class q19_Abstraction {

    public static void main(String[] args) {
        Car obj1 = new Petrol();
        obj1.refuel();
        obj1.engine();
        Car obj2 = new Ev();
        obj2.refuel();
        obj2.engine();
    }

}
