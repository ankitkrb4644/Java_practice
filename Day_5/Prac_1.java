
import java.io.*;
public class Prac_1{
public static void changeCase(String s){
    String result = s.substring(0, 1).toUpperCase() + s.substring(1);
    System.out.println(result);
    String s1 = s.toUpperCase();
    System.out.println(s1);
}
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            
            changeCase(s);
        }
    }
}
