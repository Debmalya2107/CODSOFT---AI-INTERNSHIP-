abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Guard {
    void protect();
}

// Class Dog extends abstract class and implements multiple interfaces
class Dog extends Animal implements Pet, Guard {

    Dog(String name) {
        super(name);
    }

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println(name + " barks: Woof Woof!");
    }

    // Implementing Pet interface
    @Override
    public void play() {
        System.out.println(name + " loves to play fetch.");
    }

    // Implementing Guard interface
    @Override
    public void protect() {
        System.out.println(name + " guards the house.");
    }
}

public class InterfaceAbstractInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy");

        // Abstract class methods
        myDog.sound();
        myDog.sleep();

        // Interface methods
        myDog.play();
        myDog.protect();
    }
}