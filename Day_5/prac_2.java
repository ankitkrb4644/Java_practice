    // Given two char c1 and c2.  you need to print all the alphabet starting from c1 to c2 in a single line.
    // Example 1:
    // Input:
    // c1 = 'a'
    // c2 = 'z'
    // Output: 
    // a b c d e f g h i j k l m n o p q r s t u v w x y z
    // Explanation: Printed alphabets from a to z.
import java.io.*;
public class prac_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bc.readLine());
        while (n-- > 0) {
            char c1 = bc.readLine().trim().charAt(0);
            char c2 = bc.readLine().trim().charAt(0);

            alphabets(c1, c2);
        }
    }
public static void alphabets(char c1 , char c2) {
        if(c1 <= c2){
            for(char ch=c1; ch<=c2; ch++){
                System.out.print(ch + " ");
            }
        }
        else {
            for(char ch = c1; ch >= c2; ch--){
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}