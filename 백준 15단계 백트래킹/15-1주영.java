package back;
import java.io.*;
import java.util.StringTokenizer;

public class trek {  //메모리:44596KB 시간:220ms
	static int[] arr;
	static boolean[] visit;            //방문여부
	static StringBuilder sb=new StringBuilder();
	    

 public static void back(int N, int M, int d) {
	 if(d==M){  //dfs 깊이 끝까지 다 탐색하면
		 for(int a:arr) sb.append(a+" ");
		 sb.append("\n");
		 return;
	 }
	 
	 for(int i = 1; i<=N; i++) { //N까지 for문 돌림
		 if(!visit[i]) {         //방문하지 않았으면
			 visit[i]=true;      //방문하고 true값 주고 arr[d] 배열에 i값 넣기
			 arr[d]=i;           
			 back(N,M,d+1);      //d+1주어 다음 노드 검색
			 visit[i]=false;     //방문한곳은 false값 넣어 방문하지않기
		 }
	 }
	 
	 return;	 
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
 



