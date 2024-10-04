import java.io.*;
// Binary to Decimal Conversion: Convert a binary number to its decimal equivalent.
public class prac_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a binary number:");
        String binary = br.readLine();
        
        int decimal = Integer.parseInt(binary, 2);
        
        System.out.println("Decimal equivalent: " + decimal);
    }
}
