public class FibonacciChallenge {
    
    public static void main(String[] args) {
        // Fix me: Should we allow negative numbers as input?
        System.out.println("Fibonacci(5) = " + fibonacci(5));
        System.out.println("Fibonacci(10) = " + fibonacci(10));
        
        // Fix me: What happens with this test case?
        System.out.println("First 8 Fibonacci numbers:");
        printFibonacciSequence(8);
        
        System.out.println("\nUsing efficient algorithm:");
        System.out.println("Fibonacci(40) = " + efficientFibonacci(40));
    }
    
    public static int fibonacci(int n) {
        // Fix me: Remember, Fibonacci sequence starts with 0, 1, ...
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void printFibonacciSequence(int n) {
        // Fix me: Off-by-one error?
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    public static int efficientFibonacci(int n) {
        // Fix me: How can you avoid recalculating the same Fibonacci numbers repeatedly?
        if (n == 0) {
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int a = 0;
        int b = 1;
        
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
