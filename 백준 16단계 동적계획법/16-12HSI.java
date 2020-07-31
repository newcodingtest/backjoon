package baekjoon;

import java.io.*;
import java.util.*;

public class N11054 {
	public static int N;
	public static int[] arr, downDP, resultDP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max=0;
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		downDP = new int[N];
		resultDP = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0 ; i<N ; i++) { find_down(i); }
		
		for(int i=0 ; i<N ; i++) {max = Math.max(max, find_longest_bionic(i));}
		
		System.out.print(max);
	}
	
	public static int find_down(int cur) {
		if(downDP[cur] != 0)	return downDP[cur];
		
		boolean flag = false;
		for(int i=cur ; i<N ; i++) {
			if(arr[cur] > arr[i])	{
				downDP[cur] = Math.max(downDP[cur], find_down(i)+1);
				flag = true;
			}
		}
		
		if(flag)	return downDP[cur];
		else		return downDP[cur] = 1;
		
	}
	
	public static int find_longest_bionic(int cur) {
		if(resultDP[cur] != 0)	return resultDP[cur];
		
		boolean flag = false;
		for(int i=cur ; i<N ; i++) {
			if(arr[cur] < arr[i])	{
				resultDP[cur] = Math.max(resultDP[cur], find_longest_bionic(i)+1); 
				flag = true;
			}
		}
		
		if(flag)		return resultDP[cur] = Math.max(resultDP[cur], downDP[cur]);
		else		return resultDP[cur] = downDP[cur];
	}
}