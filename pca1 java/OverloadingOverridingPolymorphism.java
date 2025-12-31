class Calculator {
    // Method Overloading → same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    // final method → cannot be overridden
    public final void eat() {
        System.out.println("Animals eat food");
    }

    // static method → cannot be overridden (method hiding instead)
    public static void sleep() {
        System.out.println("Animals sleep at night");
    }

    // private method → cannot be overridden (only accessible inside class)
    private void breathe() {
        System.out.println("Animal breathes");
    }
}

// Derived class
class Dog extends Animal {
    // Method Overriding → same method name & signature
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Method hiding (not overriding)
    public static void sleep() {
        System.out.println("Dog sleeps in the daytime");
    }
}

public class OverloadingOverridingPolymorphism {
    public static void main(String[] args) {
        // ---- Method Overloading ----
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(10, 20));
        System.out.println("Add double: " + calc.add(5.5, 6.5));
        System.out.println("Add String: " + calc.add("Hello, ", "World"));

        // ---- Method Overriding + Polymorphism ----
        Animal a = new Dog();   // Runtime polymorphism
        a.sound();              // Calls Dog’s sound()
        a.eat();                // Calls Animal’s eat() → cannot be overridden
        a.sleep();              // Calls Animal’s sleep() (static → method hiding)

        Dog d = new Dog();
        d.sleep();              // Calls Dog’s sleep()
    }
}