class Vehicle {

    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    public void drive() {
        System.out.println("Car is driving using features of Vehicle");
    }
}

public class INHERITANCE {

    public static void main(String[] args) {

        System.out.println("Creating Car object");
        Car c = new Car();

        System.out.println("Calling method from parent class");
        c.start();

        System.out.println("Calling method from child class");
        c.drive();
    }
}
