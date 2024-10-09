package Day_4;
// find Speed of the train using scanner class
import java.util.Scanner;
public class prac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int totalDis = 800;
        int speedMs = speed* 5/18;
        int time = totalDis/speedMs;
        System.out.println(time);
    }
}
