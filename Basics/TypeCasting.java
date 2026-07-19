package Basics;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Implicit Casting (int to double): " + myDouble);

        // Explicit Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("Explicit Casting (double to int): " + myInt2);
    }
    
}
