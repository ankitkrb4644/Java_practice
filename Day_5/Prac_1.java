import java.io.*;
class Prac_1{
public static void changeCase(String s){
    // code here
    String result = s.substring(0, 1).toUpperCase() + s.substring(1);
    System.out.println(result);
    String s1 = s.toUpperCase();
    System.out.println(s1);
}
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        while( n-- > 0){
            String s = read.readLine().trim();
            
            changeCase(s);
        }
    }
}
