import java.io.*;
// Reverse a String: Write a program to reverse the characters of a string.
public class prac_15{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str = br.readLine();
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        System.out.println("Reversed String: " + reversed);
    }
}

