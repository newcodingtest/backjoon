//첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 999955
package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DY13_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long start = System.currentTimeMillis();
		contstructor(n);
		long end = System.currentTimeMillis();
		double sbTime = (end-start) / 1000.0;
//		System.out.println("sbTime : " + sbTime);
	}

	public static void contstructor(int n) {
		StringBuilder sb = new StringBuilder();
		int array[] = new int[n];
		int i, sum2, answer, tmp=n;
		for(i=0;i<n;i++) {
			array[i] = i+1;
			sum2 = array[i]/1000000 + (array[i]%1000000)/100000 + (array[i]%100000)/10000+ (array[i]%10000)/1000
					+ (array[i]%1000)/100	+ (array[i]%100)/10 + array[i]%10;
			answer = array[i]+sum2;
//			System.out.print(sum2);
//			System.out.println(array[i]);
			if(answer==n) {
//				System.out.println(array[i]);
//				System.out.println(sum2);
				if(answer<=tmp) {
					tmp=array[i];					
				}
			}
		}
		if(tmp==n) tmp=0;
		sb.append(tmp);
		System.out.println(sb);
	}

}
