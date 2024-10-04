import java.io.*;
// check whether the user input number is Perfect number or not 
public class prac_6 {
    public static void main(String[] args) {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Enter the number");
        int number = Integer.parseInt(bc.readLine());
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
    catch(IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
