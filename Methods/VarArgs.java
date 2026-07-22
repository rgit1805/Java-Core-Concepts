package Methods;

public class VarArgs {
    // Method to calculate the sum of variable number of integers
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();

        // Calling the sum method with different number of arguments
        System.out.println("Sum of 1, 2, 3: " + varArgs.sum(1, 2, 3));
        System.out.println("Sum of 4, 5: " + varArgs.sum(4, 5));
        System.out.println("Sum of 6: " + varArgs.sum(6));
        System.out.println("Sum of no arguments: " + varArgs.sum());
    }
    
}
