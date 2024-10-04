package Day_4;
import java.io.*;
public class prac_1 {
    public static void main(String arg[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int speed = Integer.parseInt(br.readLine());
            int totalDis = 800;
            double speedMs = speed * 5/18;
            int time = (int) (totalDis / speedMs) ;
            System.out.println(time);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
