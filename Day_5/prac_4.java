import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// find the prime number upto n-1.
class prac_4 {
    // Optimized method using Sieve of Eratosthenes to count primes less than n
    public static int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        // Create a boolean array to track primes
        boolean[] isPrime = new boolean[n];
        
        // Initially assume all numbers from 2 to n-1 are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Implement the Sieve of Eratosthenes
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime starting from p^2
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Count primes less than n
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }

        return primeCount; // Return the total count of primes
    }

    // Method to print all primes less than n 
    // In this function we use same code from boolean till Sieve of Eratosthenes then you create a for loop and print all prime numbers
    public static void printPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        System.out.println("Prime numbers less than " + n + ": ");
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " "); // Print each prime number
            }
        }
        System.out.println(); // New line after printing all primes
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Use BufferedReader for input
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(reader.readLine()); // Read the input as a string and parse it as an integer

        // Call the countPrimes method to get the total number of primes
        System.out.println("Number of prime numbers less than " + n + ": " + countPrimes(n));

        // Call the printPrimes method to print all the prime numbers
        printPrimes(n);
    }
}
