class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class → Inheritance from Person
class Student extends Person {
    String course;

    // Constructor → using super()
    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Constructor Overloading
    Student(String name, String course) {
        super(name, 18); // default age = 18
        this.course = course;
    }

    // Method Overriding → overriding display() from Person
    @Override
    void display() {
        System.out.println("Student: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class AssignmentExample {
    public static void main(String[] args) {
        // Object with normal constructor
        Person p1 = new Person("Amit", 45);
        p1.display();  // calls Person display()

        // Object with overloaded constructor
        Student s1 = new Student("Riya", 20, "Computer Science");
        s1.display();  // calls Student display()

        // Object with constructor overloading
        Student s2 = new Student("Arjun", "Mathematics");
        s2.display();  // calls Student display()
    }
}
