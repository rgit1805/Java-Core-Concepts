package ControlFlow;

public class IfElse {
    public static void main(String[] args) {
        int number = 10;

        // If statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-Else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // If-Else If-Else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    
}
