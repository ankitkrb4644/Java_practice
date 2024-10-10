
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