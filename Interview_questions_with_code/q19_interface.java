interface Radio {
    void playRadio();
}

interface MyCar extends Radio {
    void drive();
}

class Cars implements MyCar {
    public void playRadio() {
        System.out.println("Radio Starts");
    }

    public void drive() {
        System.out.println("Car Starts");
    }
}


public interface q19_interface {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.drive();
        car.playRadio();
    }
}
