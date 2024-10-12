import java.io.*;
class prac_5 {
//ADD Digits of a Number e.g:-
// input : 38
// output: 2
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args){
        try{
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number:");
        int num = Integer.parseInt(bc.readLine());
        // Solution solution = new Solution(); // Create an instance
        System.out.println(addDigits(num)); // Call the non-static method
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}