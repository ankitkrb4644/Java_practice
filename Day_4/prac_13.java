import java.io.*;
// Pascal's Triangle up to 
public class prac_13 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            int number = 1; // First number in a row is always 1
            // Print spaces to center the triangle
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Generate the elements in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
    }
}

