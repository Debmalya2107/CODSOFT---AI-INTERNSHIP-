// AccessEncapsulationAbstraction.java

// Abstract class → Abstraction
abstract class Vehicle {
    // public method
    public void start() {
        System.out.println("Vehicle is starting...");
    }
    
    // abstract method (must be implemented by child class)
    public abstract void fuelType();
}

// Child class
class Car extends Vehicle {
    // private variable → Encapsulation
    private String model;
    
    // protected variable
    protected int speed;
    
    // default (package-private) variable
    String color;
    
    // constructor
    public Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }
    
    // getter and setter (to access private variable)
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    // implementing abstract method
    @Override
    public void fuelType() {
        System.out.println("Car runs on Petrol or Diesel.");
    }
    
    // method to display details
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }
}

public class AccessEncapsulationAbstraction {
    public static void main(String[] args) {
        Car myCar = new Car("Honda City", 120, "Black");
        
        myCar.start();          // public method from abstract class
        myCar.fuelType();       // implemented abstract method
        myCar.display();        // access all details
        
        // Accessing private variable via getter
        System.out.println("Car Model via Getter: " + myCar.getModel());
        
        // Modifying private variable via setter
        myCar.setModel("Hyundai Verna");
        System.out.println("Updated Model via Getter: " + myCar.getModel());
    }
}
