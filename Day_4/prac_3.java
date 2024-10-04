import java.io.*;

public class prac_3 {
    // Check Leap year
    public static void main(String[] args) {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a Year");
            int year = Integer.parseInt(bc.readLine());
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } 
            else {
                System.out.println("Not a Leap Year");
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
