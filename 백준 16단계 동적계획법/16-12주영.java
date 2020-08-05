package back;

import java.io.*;
import java.util.*;

/*
arr[] 1 5 2 1 4 3 4 5 2 1
      ->
dp[]  1 2 2 1 3 3 4 5 2 1
                       <-
dp[]  1 5 2 1 4 3 3 3 2 1

5+3-1=7

  */

public class dp12{ //메모리:14640 시간:116
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int n = Integer.parseInt(br.readLine());
 
        int[] arr = new int[n+1];
        int[][] dp = new int[2][n+1];
        int max = 0;
        
        tokenizer = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        for(int i = 1; i <= n; i++) {
            int maxLen = 0;
            for(int j = 1; j < i; j++) {
                if(arr[j] < arr[i] && maxLen < dp[0][j]) {
                   
                        maxLen = dp[0][j];
                    
                }
            }
            dp[0][i] = maxLen + 1;
        }
        for(int i = n; i > 0; i--) {
            int maxLen = 0;
            for(int j = n; j > i ; j--) {
                if(arr[j] < arr[i] && maxLen < dp[1][j]) {
                    
                        maxLen = dp[1][j];
                    
                }
            }
            dp[1][i] = maxLen + 1;
        }
        
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, dp[0][i] + dp[1][i] - 1);
        }
        
        bw.write(String.valueOf(max));
        br.close();
        bw.close();
    }
}