#include <stdio.h>

int fibonacci(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1; 
    
    int a = 0, b = 1, temp;
    for (int i = 2; i <= n; i++) {
        temp = a + b;
        a = b;
        b = temp;
    }
    return b; // return b should be after the loop ends
}

int main() {
    int n = 10;
    printf("The %dth Fibonacci number is: %d\n", n, fibonacci(n));
    return 0;
}
