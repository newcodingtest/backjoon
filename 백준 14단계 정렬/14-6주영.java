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
			//Arrays.sort() 내부에 Comparator를 구현할 수 있도록 정의되어 있다
			public int compare(int[] x1, int[] x2) { // compare은 기본적으로 오름차순으로 정렬됨
				
				   if(x1[0]==x2[0]) {return Integer.compare(x1[1], x2[1]);} // x값을 기준으로 오름차순 진행
				
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

