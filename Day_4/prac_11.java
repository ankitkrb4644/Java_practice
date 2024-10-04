import java.io.*;

public class prac_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Input the array size
        System.out.print("Enter the number of elements: ");
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        // Input the array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // Finding duplicates
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Break to avoid multiple print of same duplicate
                }
            }
        }
    }
}

