package baekjoon;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class N11053_LIS {
	public static int[] DP, A;
	public static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int i=0, max=0;
		A = new int[N];
		DP = new int[N];
		
		for(String str : br.readLine().split(" "))	{
			A[i++] = Integer.parseInt(str); 
		}
		
		for(int j=0 ; j<N ; j++) {
			max = Math.max(LIS(j), max);
		}
		
		out.println(max);
	}
	
	public static int LIS(int idx) {
		if(DP[idx] != 0)	return DP[idx];
		
		boolean flag = false;
		for(int i=idx ; i<N ; i++) {												// now보다 뒤에 더 큰 숫자가 있는지 확인
			if(A[i] > A[idx]) {														// 있다면 재귀 , 없다면 flag = false로 DP 1 리턴
				DP[idx] = Math.max(DP[idx], LIS(i)+1);
				flag = true;
			}
		}
		
		if(flag)	return DP[idx];										
		else		return DP[idx] = 1;
	}
}