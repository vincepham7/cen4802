package Assignment2;
public class Fibonacci {
    // Recursive method to calculate the nth term in the Fibonacci sequence
    public static int fibonacciRecursive(int n) {
        // Base case: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        }
        // Recursive case: calculate the nth term by summing the previous two terms
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        // Call the fibonacciRecursive method to get the nth term of the Fibonacci sequence
        int nthTerm = fibonacciRecursive(n);
        // Output the result
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}