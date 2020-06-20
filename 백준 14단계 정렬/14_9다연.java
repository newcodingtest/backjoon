package week5;

import java.io.*;
import java.util.*;

public class DY14_9 {
// 56040KB 732ms
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String arr[][] = new String [n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr,new Comparator<String[]>() { // 0:나이 , 1:이름

			@Override
			public int compare(String[] o1,String[] o2) {										
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}		
		});
		
		for(int i=0;i<n;i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		
		bw.close();
	}

}
