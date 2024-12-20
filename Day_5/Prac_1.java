// Example 1: 
// Input:
// s = "hello"
// Output: 
// Hello
// HELLO
// Explanation: In Hello,the first letter is
// capitalized. In HELLO all letters are in
// the uppercase.
import java.io.*;
public class Prac_1 {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            // Read input string
            String s = read.readLine().trim();

            // Capitalize the first letter and leave the rest of the string unchanged
            String result = s.substring(0, 1).toUpperCase() + s.substring(1);

            // Print the result
            System.out.println("Capitalized String: " + result);

            // Print the string in all uppercase
            String s1 = s.toUpperCase();
            System.out.println("Uppercase String: " + s1);
        }
}
