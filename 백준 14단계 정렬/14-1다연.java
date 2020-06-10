package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DY14_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		int array[] = new int [10001];
		for(int i = 0;i<num;i++) {
			array[Integer.parseInt(bf.readLine())]++ ;
		}
		
		for(int i=1;i<10001;i++) {
			if(array[i]>0) {
				for(int j=0;j<array[i];j++) {
					bw.write(i+"\n");
				}
			}
		}
		bw.close();

//		int tmp;
//		if(i>0) {
//			for(int j=0;j<i;j++) {
//				if(array[i]<array[j]) {
//					tmp = array[i];
//					array[i] = array[j];
//					array[j] = tmp;
//				}
//			}
//		}
//		
//		for(int i = 0;i<array.length;i++) {
//			bw.write(array[i]+"\n");
//		}
	}
}
