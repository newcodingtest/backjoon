package back;
import java.io.*;
import java.util.Arrays;

public class sort3 { 
	public static void main(String[] args) throws IOException { //오름차순으로 정렬
	    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());  //n개의 수가 주어졌을때
		int[] arr = new int[N];                   //n배열 생성 
        
		for(int i = 0; i < N; i++){               //n개 돌리면서
			arr[i] = Integer.parseInt(br.readLine());  //배열안의 값을 int형으로 읽는다
		}
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++){                      //배열값을 증가시키면서 출력 < 오름차순
			sb.append(arr[i]).append('\n');
		}
 
		System.out.println(sb);
	}
}