package Assignment2;
/**
 * Class that calculate the nth term in the Fibonacci sequence.
 */
public class Fibonacci {

    /**
     * Calculates the nth term in the Fibonacci sequence recursively.
     *
     * @param n the position of the term to calculate
     * @return the nth term in the Fibonacci sequence
     */
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Main method that calls the fibonacciRecursive method to calculate the 10th term of the Fibonacci sequence.
     * Outputs the result
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int nthTerm = fibonacciRecursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}
