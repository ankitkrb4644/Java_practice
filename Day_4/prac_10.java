import java.io.*;
public class prac_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.print("Enter a number: ");
        String number = reader.readLine();
        
        String modifiedNumber = number.replace('0', '5');
        
        System.out.println("Modified number: " + modifiedNumber);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
