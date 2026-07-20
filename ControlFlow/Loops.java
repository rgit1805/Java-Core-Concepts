package ControlFlow;

public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While loop
        System.out.println("\nDo-While loop:");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);
    }
    
}
