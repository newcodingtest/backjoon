package back;
import java.io.*;
import java.util.StringTokenizer;

public class trek1 { //�޸�:15336KB �ð�:92ms
	static int[] arr;
	static boolean[] visit;            //�湮����
	static StringBuilder sb=new StringBuilder();
	    

 public static void back(int N, int M, int d) {
	 if(d==M){  //dfs ���� ������ �� Ž���ϸ�
		 for(int i=0; i<M-1; i++) { //�ߺ� ���Ÿ� ����
			 if(arr[i]>arr[i+1])    //�������� ����̱� ������ ù��° �ε������� �ι�° ������ ũ�� ����
				 return;
		 }
		 for(int a:arr) sb.append(a+" ");
		 sb.append("\n");
		 return;
	 }
	 
	 for(int i = 1; i<=N; i++) { //N���� for�� ����
		 if(!visit[i]) {         //�湮���� �ʾ�����
			 visit[i]=true;      //�湮�ϰ� true�� �ְ� arr[d] �迭�� i�� �ֱ�
			 arr[d]=i;           
			 back(N,M,d+1);      //d+1�־� ���� ��� �˻�
			 visit[i]=false;     //�湮�Ѱ��� false�� �־� �湮�����ʱ�
		 }
	 }
	 
	 return;	 
	 }


 public static void main(String[] args)throws IOException {
	 StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
	 int N=Integer.parseInt(st.nextToken());   //N���� �Է¹���
	 int M=Integer.parseInt(st.nextToken());   //�迭
	 arr=new int[M];
	 visit=new boolean[N+1];
	 
	back(N,M,0);
	System.out.println(sb);
			 
	 }
}
 



