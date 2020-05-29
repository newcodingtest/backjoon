package sds;

import java.util.Scanner;

public class 13-1MS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int dest = s.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int max = 0;
		big:for(int i=0; i<arr.length - 2; i++) {
			for(int j=i+1; j<arr.length - 1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					int tmp = arr[i]+arr[j]+arr[k];
					if(max <= dest) {
						max = Math.max(max, tmp);						
					}
					if(max == dest){
						break big;
					}
				}
			}
		}
		System.out.println(max);
	}
}
