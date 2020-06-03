package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DY13_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int num = 666;
		int cnt = 0;
		int tmp = 0;
		boolean flag;
		while(cnt!=n) {
			tmp = num;
			flag = false;
			while(tmp>0) {
				if(tmp%1000==666) {
					flag = true;
					break;
				}
				tmp = tmp/10;				
			}
			if(flag) cnt++;
			num++;
		}
		sb.append(num-1);
		System.out.println(sb);
	}

}
