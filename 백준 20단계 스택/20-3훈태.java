package com.test.ds.stack;

import java.util.Scanner;

/**
 *  괄호 : https://www.acmicpc.net/problem/9012
 *  
 *  몇 개의 여는 괄호가 있는지 파악해서 구현 ( 스택 사용 X )
 */
public class Ex9012 {
	
	static String isValid(String s) {
		int n = s.length();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) 
		{
			if ( s.charAt(i) == '(' ) 
			{
				cnt += 1;
			} else 
			{
				cnt -= 1;
			}
			
			if ( cnt < 0 ) 
			{
				return "NO";
			}
		}
		
		if ( cnt == 0 ) 
		{
			return "YES";
		} else 
		{
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while ( n-- > 0 ) 
		{
			System.out.println(isValid(sc.next()));
		}
		
		sc.close();
	}
}