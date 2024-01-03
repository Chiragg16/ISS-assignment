// Class definition
class Vehicle {
    // Instance variables
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // Method
    public void startEngine() {
        System.out.println("Engine started!");
    }
}

// Inheritance
class Car extends Vehicle {
    // Additional instance variable
    private int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Polymorphism
    @Override
    public void startEngine() {
        System.out.println("Car engine started!");
    }

    // Encapsulation
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

// Abstraction
interface Drivable {
    void drive();
}

// Implementing interface
class Motorcycle implements Drivable {
    @Override
    public void drive() {
        System.out.println("Motorcycle is being driven!");
    }
}

// Main class
public class Oops {
    public static void main(String[] args) {
        // Object creation
        Vehicle vehicle = new Vehicle("Toyota", 2021);
        Car car = new Car("Honda", 2022, 4);
        Motorcycle motorcycle = new Motorcycle();

        // Accessing instance variables
        System.out.println("Vehicle Brand: " + vehicle.getBrand());
        System.out.println("Vehicle Year: " + vehicle.getYear());
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Doors: " + car.getNumberOfDoors());

        // Calling methods
        vehicle.startEngine();
        car.startEngine();
        motorcycle.drive();
    }
}
