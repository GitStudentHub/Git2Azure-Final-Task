def fibonacci_iterative(n):
    if n <= 0:
        return 0
    elif n == 1: #Fixed n==2 to n==1 and return 1 has been changed to return 0
        return 0
    
    a, b = 0, 1
    for _ in range(2, n+1):
        a, b = b, a + b
    return b # Fixed indentation of return b.

n = 10
print(f"The {n}th Fibonacci number is: {fibonacci_iterative(n)}")