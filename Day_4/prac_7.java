import java.io.*;
public class prac_7 {
    // generate the Fibonacci series up to n terms:
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter the number of terms: ");
        int n = Integer.parseInt(reader.readLine());
        
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    catch(IOException e) {
        System.out.println(e.getMessage());
    }
    }
}

