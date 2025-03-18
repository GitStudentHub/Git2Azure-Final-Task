#include <iostream>
using namespace std;

// Function to generate Fibonacci series up to n terms
void fibonacci(int n) {
    int first = 0, second = 1, next;
    
    cout << "Fibonacci Series: ";
    for (int i = 0; i < n; i++) {
        // Print the first term correctly
        cout << first << " ";
        
        // Compute the next term correctly
        next = first + second;
        first = second;
        second = next;
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;
    
    // Call the function with the correct argument
    fibonacci(n);
    
    return 0;
}