package test3;

import java.util.*;

public class 11-1Ms {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(fact(num));
		
	}
	public static int fact(int num){
		if(num == 1 || num == 0){
			return 1;
		}else{
			return num * fact(num-1);
		}
	}
}
