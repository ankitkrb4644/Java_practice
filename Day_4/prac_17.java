import java.io.*;
// Convert String Case: Convert lowercase characters of a string to uppercase and vice versa
public class ConvertCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str = br.readLine();
        
        StringBuilder convertedStr = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                convertedStr.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                convertedStr.append(Character.toLowerCase(c));
            } else {
                convertedStr.append(c);
            }
        }
        
        System.out.println("Converted String: " + convertedStr.toString());
    }
}
