package com.exam.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  평범한 배낭 : https://www.acmicpc.net/problem/12865
 *  
 *  Knapack Problem 으로 유명한 문제임
 *    크게 2가지 유형으로 분리된다
 *    1. Fractional Knapsack ( 보석을 자를 수 있다고 가정 ) ==> Greedy 로 해결 
 *    2. 0-1 Knapsack ( 보석을 자를 수 없다고 가정 )        ==> DP 로 해결
 *    
 *  D[i][j] = i 번째  물건으로  j 의 무게를 채울 수 있는 최대 가치
 *  
 *  MAX ( 이전까지 구한 가방의 가치 , 현재 가방의 가치 + 남은 가방 무게만큼 나머지 가방을 넣었을 때 가치 )
 *  
 *  ex)      w1   w2   w3   w4   w5   w6   w7
 *      1     0    0    0    0    0   13   13
 *      2     0    0    0    8    8   13   13
 *      3     0    0    6    8    8   13   14
 *      4     0    0    6    8   12   13   14
 */
public class Ex12865 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 물건의 개수
		int k = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게
		
		int[][] bag = new int[n + 1][2];
		int[][] d = new int[n + 1][k + 1];
		
		for (int i = 0; i < n; i++) 
		{
			st = new StringTokenizer(br.readLine());
			bag[i][0] = Integer.parseInt(st.nextToken()); // 가방의 무게
			bag[i][1] = Integer.parseInt(st.nextToken()); // 가방의 가치
		}
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= k; j++) 
			{
				if ( bag[i - 1][0] <= j ) 
				{
					d[i][j] = Math.max(d[i - 1][j], bag[i - 1][1] + d[i - 1][j - bag[i - 1][0]]);
				} 
				else 
				{
					d[i][j] = d[i - 1][j];
				}
			}
		}
		
		System.out.println(d[n][k]);
	}
}