package OOP;

public class ClassesAndObject {
    // Class to represent a simple object with properties and methods
    private String name;
    private int age;

    // Constructor to initialize the object
    public ClassesAndObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the object's details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of the ClassesAndObject class
        ClassesAndObject person = new ClassesAndObject("Alice", 30);
        
        // Calling the method to display the object's information
        person.displayInfo();
    }
    
}
