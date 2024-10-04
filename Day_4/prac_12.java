import java.io.*;
// sum of all elements in an array
public class prac_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements in the array: ");
        int n = Integer.parseInt(reader.readLine());
        
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int sum = 0;
        for (int num : array) {
            sum += num; // Calculate the sum of array elements
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}

