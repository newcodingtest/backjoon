package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *  ATM : https://www.acmicpc.net/problem/11399
 *  
 *  Bruteforce 로는 O(N!) 이 걸리므로 N 이 1000 이하이므로 불가능하다.
 *  
 *  기다리는 시간이 짧은 사람이 먼저 인출하는 것이 좋다.
 *  
 *  따라서 non-decreasing order 가 정답이다.
 */
public class Ex11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] p = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) 
		{
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int ans = 0;
		
		Arrays.sort(p);
		
		for (int i = 0; i < n; i++)
		{
			sum += p[i];
			ans += sum;
		}
		
		System.out.println(ans);
	}
}