import java.util.Scanner;
// You need to return one array of the same length first filled with even numbers and then by odd number
class Day1 {
    public static int[] evenOdd(int[] numbers) {
        int n = numbers.length;
        int[] evens = new int[n];
        int[] odds = new int[n];
        int evenIndex = 0, oddIndex = 0;

        // Separate the numbers into evens and odds
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[evenIndex++] = num;
            } else {
                odds[oddIndex++] = num;
            }
        }

        // Combine evens and odds back into one array
        int index = 0;
        for (int i = 0; i < evenIndex; i++) {
            numbers[index++] = evens[i];
        }
        for (int i = 0; i < oddIndex; i++) {
            numbers[index++] = odds[i];
        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = scn.nextInt();
            }
            int[] res = evenOdd(numbers);

            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
