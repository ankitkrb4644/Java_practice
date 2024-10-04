import java.io.*;
public class prac_4 {
    // Check if a number is prime or Not
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.readLine());
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i*i <=number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
