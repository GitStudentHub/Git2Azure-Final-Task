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
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void printFibonacciSequence(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    public static int efficientFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;
    }
}

