import java.io.*;
// Decimal to Binary Conversion: Convert a decimal number to its binary equivalent.
public class prac_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a decimal number:");
        int decimal = Integer.parseInt(br.readLine());
        
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("Binary equivalent: " + binary);
    }
}
