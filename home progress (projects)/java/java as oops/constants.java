//class & object
/*
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        pen1.printcolor();

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen2.write();
        pen2.printcolor();
    }
}
*/
//constructor variation-I
/*
class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class oops{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;

        student1.printinfo();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;

        student2.printinfo();
    }
}
*/
//Constructor variation-II
/*
class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class oops{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.printinfo();
        Student student2 = new Student("Bob", 22);

        student2.printinfo();
    }
}
*/
//Constructor variation-III
class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    student(student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    student(){
        
    }
}

public class constants{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Alice";
        s1.age = 20;
        student s2 = new student(s1);
        s2.printinfo();
    }
}