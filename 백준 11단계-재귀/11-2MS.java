package test3;

import java.util.*;

public class 11-2MS {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(fibo(num));
	}
	public static int fibo(int num){
		if(num <= 1){
			return num;
		}else{
			return fibo(num-1) + fibo(num-2);
		}
	}
}
