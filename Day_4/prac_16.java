import java.io.*;
import java.util.Arrays;
// Anagram Check: Check if two strings are anagrams of each other.
public class prac_16{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first string:");
        String str1 = br.readLine();
        System.out.println("Enter the second string:");
        String str2 = br.readLine();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
