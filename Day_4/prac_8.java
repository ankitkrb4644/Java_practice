import java.io.*;

public class prac_8 {
    // Sum of First n Natural Numbers
    public static void main(String[] args){
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.print("Enter a number n: ");
        int n = Integer.parseInt(bc.readLine());
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    }
