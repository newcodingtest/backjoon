package back;
import java.io.*;
import java.util.*;

public class sort6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		int [][] arr=new int[N][2];
		String[] str;
		
		for(int i=0; i<N; i++) {
			str=br.readLine().split(" ");
			arr[i][0]=Integer.parseInt(str[0]);
			arr[i][1]=Integer.parseInt(str[1]);
		}
		
		Arrays.sort(arr,new Comparator<int[]>() { 
			//Arrays.sort() ���ο� Comparator�� ������ �� �ֵ��� ���ǵǾ� �ִ�
			public int compare(int[] x1, int[] x2) { // compare�� �⺻������ ������������ ���ĵ�
				
				   if(x1[0]==x2[0]) {return Integer.compare(x1[1], x2[1]);} // x���� �������� �������� ����
				
				   else {return Integer.compare(x1[0],x2[0]);} // 
			}
		});
		
		for(int i=0; i<N; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+" "+"\n");
		}
            bw.flush();
            bw.close();
	}

}

