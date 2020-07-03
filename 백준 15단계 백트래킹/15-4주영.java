import java.io.*;
import java.util.StringTokenizer;

public class back4{ //메모리:21728KB 시간:268ms
	static int[] arr;
	static boolean[] visit;            //방문여부
	static StringBuilder sb=new StringBuilder();
	    

 public static void back(int N, int M, int d) {
	 if(d==M){  //dfs 깊이 끝까지 다 탐색하면
		 for(int i=0; i<M-1; i++) { //중복 제거를 위해
			 if(arr[i]>arr[i+1])    //오름차순 출력이기 때문에 첫번째 인덱스값이 두번째 값보다 크면 리턴
				 return;
		 }
		 for(int a:arr) sb.append(a+" ");
		 sb.append("\n");
		 return;
	 }
	 for(int i = 1; i<=N; i++) { //N까지 for문 돌림
		    
			 arr[d]=i;           
			 back(N,M,d+1);      //d+1주어 다음 노드 검색
			
		 }
	 }
	 
	
	 


 public static void main(String[] args)throws IOException {
	 StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
	 int N=Integer.parseInt(st.nextToken());   //N까지 입력받음
	 int M=Integer.parseInt(st.nextToken());   //배열
	 arr=new int[M];
	 visit=new boolean[N+1];
	 
	back(N,M,0);
	System.out.println(sb);
			 
	 }
}
 



