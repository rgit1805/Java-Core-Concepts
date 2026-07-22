package Methods;

public class Recursion{
    // Recursive method to calculate factorial of a number
    public int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        // Calculating factorial of 5
        int number = 5;
        int result = recursion.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

}