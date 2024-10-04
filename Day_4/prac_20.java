import java.io.*;

public class prac_20 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = Double.parseDouble(br.readLine());
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
