    #include <iostream>
    using namespace std;
       
       // Function to generate Fibonacci series up to n terms
       void fibonacci(int n) {
           int first = 0, second = 1, next;
           
           cout << "Fibonacci Series: ";
           for (int i = 0; i < n; i++) {
               // FIXME: Print the first term correctly---FIXED
               cout << first << " ";
               
               // FIXME: Compute the next term correctly--FIXED
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
           
           // FIXME: Call the function with correct argument--FIXED
           fibonacci(n);
           
           return 0;
       }