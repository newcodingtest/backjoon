package com.algo.greedy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  잃어버린 괄호 : https://www.acmicpc.net/problem/1541
 *  
 *  최소를 만들어야 하므로 '-'가 나오는 부분부터 괄호를 쳐서 다음 '-'가 나오기 전에 닫아준다 
 */
public class Ex1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> sign = new ArrayList<Integer>();
		
		boolean minus = false;
		int cur = 0;
		
		sign.add(1);
		for ( char x : s.toCharArray() )
		{
			if ( x == '+' || x == '-' )
			{
				if ( x == '+' )
				{
					sign.add(1);
				} else 
				{
					sign.add(-1);
				}
				
				num.add(cur);
				cur = 0;
			} else 
			{
				cur = cur * 10 + (x - '0');
			}
		}
		
		num.add(cur);
		
		int ans = 0;
		
		for (int i = 0; i < num.size(); i++)
		{
			if ( sign.get(i) == -1 )
			{
				minus = true;
			}
			
			if (minus)
			{
				ans -= num.get(i);
			} else 
			{
				ans += num.get(i);
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}