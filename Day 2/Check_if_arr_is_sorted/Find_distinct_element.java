import java.io.*;
import java.util.*;

class Find_distinct_element {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for (int i = 0; i < N * N; i++)
                M[i / N][i % N] = Integer.parseInt(arr[i]);

            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}

class Solution {
    int distinct(int M[][], int N) {
        if (N == 0) return 0;
        
        // Initialize the commonElements set with elements from the first row
        HashSet<Integer> commonElements = new HashSet<>();
        for (int j = 0; j < N; j++) {
            commonElements.add(M[0][j]);
        }
        
        // Iterate over remaining rows and retain only elements that are common
        for (int i = 1; i < N; i++) {
            HashSet<Integer> currentRowElements = new HashSet<>();
            for (int j = 0; j < N; j++) {
                currentRowElements.add(M[i][j]);
            }
            commonElements.retainAll(currentRowElements);
        }
        
        // The size of the commonElements set is the number of common elements across all rows
        return commonElements.size();
    }
}

