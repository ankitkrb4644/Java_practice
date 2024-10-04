import java.io.*;

public class prac_5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(reader.readLine());

            int originalNumber = number;
            int result = 0;
            int digits = String.valueOf(number).length();

            while (number != 0) {
                int remainder = number % 10;
                result += Math.pow(remainder, digits);
                number /= 10;
            }

            if (result == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
