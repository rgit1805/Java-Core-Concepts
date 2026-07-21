package Methods;

public class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        // Calling the first add method
        System.out.println("Sum of 2 and 3: " + mo.add(2, 3));

        // Calling the overloaded add method with three parameters
        System.out.println("Sum of 2, 3 and 4: " + mo.add(2, 3, 4));

        // Calling the overloaded add method with double parameters
        System.out.println("Sum of 2.5 and 3.5: " + mo.add(2.5, 3.5));
    }
    
}
