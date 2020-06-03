package back;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class brute3 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [][] arr=new int[N][2];         //사람의 수 [N]이 주어진다  [2]는 [몸무게,키]=2
		
		String[] str;
		for(int i=0; i<N; i++) {
		   str=br.readLine().split(" "); // split("문자") 문자를 기준으로 나눠서 읽어들인다
		   arr[i][0]=Integer.parseInt(str[0]);   //  [i][0] 몸무게
		   arr[i][1]=Integer.parseInt(str[1]);    //  [i][1] 키
		
	}
	
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int rank=1;              // 1부터 랭크시작
			
			
		  for(int j=0; j<N; j++) {
			  if(i==j) continue;
			  if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
			  rank++;
		  }
	}
		
		sb.append(rank).append(' ');
		
		}
	    System.out.println(sb);
		
}
}
