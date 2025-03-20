public class FibonacciChallenge {
    
    public static void main(String[] args) {
        System.out.println("Fibonacci(5) = " + fibonacci(5));
        System.out.println("Fibonacci(10) = " + fibonacci(10));
        
        System.out.println("First 8 Fibonacci numbers:");
        printFibonacciSequence(8);
        
        System.out.println("\nUsing efficient algorithm:");
        System.out.println("Fibonacci(40) = " + efficientFibonacci(40));
    }
    
    public static int fibonacci(int n) {
        
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
        }// Added a throw for negative inputs.
        
        if (n == 0) return 0; // Base case for n = 0
        if (n == 1) return 1; // Base case for n = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }
    
    public static void printFibonacciSequence(int n) {
        // changes i= 1 to i= 0
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    public static int efficientFibonacci(int n) {
        int a = 0, b = 1;
    
        if (n == 0) return a;
        if (n == 1) return b;
    
        for (int i = 2; i <= n; i++) { // Use <= instead of <
            int temp = a;
            a = b;
            b = temp + a;
        }
        return b;
    }
}
