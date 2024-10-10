import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac_3 {
    // Optimized method using Sieve of Eratosthenes to count primes less than n and print them
    public int countPrimes(int n) {
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

        // Count and print all primes less than n
        int primeCount = 0;
        System.out.print("Prime numbers less than " + n + ": ");
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " "); // Print the prime number
                primeCount++;
            }
        }
        System.out.println(); // Move to the next line after printing primes

        return primeCount; // Return the total count of primes
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Use BufferedReader for input
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(reader.readLine()); // Read the input as a string and parse it as an integer

        prac_3 solution = new prac_3(); // Create an instance of Solution
        int result = solution.countPrimes(n); // Call the countPrimes function

        System.out.println("Number of prime numbers less than " + n + ": " + result);
    }
}
