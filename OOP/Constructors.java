package OOP;

public class Constructors {
    // Class to demonstrate the use of constructors
    private String model;
    private int year;

    // Constructor to initialize the object
    public Constructors(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display the object's details
    public void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an instance of the Constructors class
        Constructors car = new Constructors("Toyota", 2020);
        
        // Calling the method to display the object's details
        car.displayDetails();
    }
    
}
