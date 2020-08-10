package com.exam.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  연속합 : https://www.acmicpc.net/problem/1912
 *  
 *  D[i] = i번 째 수에서 끝나는 가장 큰 연속합
 *  A[i] = i - 1 과 연속 안 함
 *      ==> MAX( D[i - 1] + A[i] , A[i] )
 *  ex) 10, -4, 3, 1, 5, 6, -35, 12, 21, -1
 *      --------------------------------------------------------------------
 *       i     1    2    3    4    5    6    7    8    9    10
 *      A[i]  10   -4    3    1    5    6   -35   12   21   -1
 *      D[i]  10    6    9    10   15   21  -14   12   33   32 --> 7~8번 유의   
 */
public class Ex1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		int[] d = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) 
		{
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		d[0] = a[0];
		int ans = d[0]; // ans 의 초기값은 -1000 or d[0] 으로 해줘야 한다. (음수가 최댓값이 들어올 수 있기 때문)
		
		for (int i = 1; i < n; i++) 
		{
			d[i] = a[i];
			
			if ( d[i] < d[i - 1] + a[i] ) 
			{
				d[i] = d[i - 1] + a[i];
			}
			
			if (ans < d[i])
			{
				ans = d[i];
			}
		}
		
		System.out.println(ans);
	}
}