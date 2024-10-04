import java.io.*;
public class prac_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(bc.readLine());
        
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10;       // Remove the last digit
        }
        
        System.out.println("The sum of the digits is: " + sum);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

