package com.test.ds.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *  균형잡힌세상 : https://www.acmicpc.net/problem/4949 
 */
public class Ex4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{
			String s = br.readLine();
			
			if ( ".".equals(s) ) break;
			
			String[] input = s.split("");
			Stack<String> stack = new Stack<String>();
			
			for (String str : input)
			{
				if ( "(".equals(str) || "[".equals(str) )
				{
					stack.push(str);
				} else if ( ")".equals(str) && !stack.isEmpty() && "(".equals(stack.peek()) )
				{
					stack.pop();
				} else if ( "]".equals(str) && !stack.isEmpty() && "[".equals(stack.peek()) )
				{
					stack.pop();
				} else if ( ")".equals(str) || "]".equals(str) )
				{
					stack.push(str);
				}
			}
			
			if ( stack.empty() )
			{
				System.out.println("yes");
			} else 
			{
				System.out.println("no");
			}
		} // while 종료 
	}
}