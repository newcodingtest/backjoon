import java.io.*;
import java.util.StringTokenizer;

public class back3{ //�޸�:296504KB �ð�:588ms
	static int[] arr;
	static boolean[] visit;            //�湮����
	static StringBuilder sb=new StringBuilder();
	    

 public static void back(int N, int M, int d) {
	 if(d==M){  //dfs ���� ������ �� Ž���ϸ�
		 for(int i=0; i<M; i++) { //�ߺ� ���Ÿ� ����
			 sb.append(arr[i]+" ");    //�������� ����̱� ������ ù��° �ε������� �ι�° ������ ũ�� ����		 
		 }
		 
		 
		 sb.append("\n");
		 return;
	 }
	 
	 for(int i = 1; i<=N; i++) { //N���� for�� ����
		    
			 arr[d]=i;           
			 back(N,M,d+1);      //d+1�־� ���� ��� �˻�
			
		 }
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
 



