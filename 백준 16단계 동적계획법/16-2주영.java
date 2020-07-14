package back;
import java.io.*;
/*
 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

          각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.
 
 출력: 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.
 
 3                           
 0                1 0
 1                0 1
 3                1 2 
 
 */

public class fab2 { //메모리:13064  시간:80
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int [][] arr=new int[41][2];   //0~40까지 읽어들임
		arr[0][0]=1;  //n이 0일때 0의 값은 1
		arr[1][1]=1;  //n이 1일때 1의 값은 1
		
		for(int i=2; i<41; i++) {  // 규칙상 n-2값이 들어가기때문에 음수를 피하기 위해선 i=2 부터 시작해야함
			for(int j=0; j<2; j++) {
				arr[i][j]=arr[i-1][j]+arr[i-2][j];
			}
		}
		for(int i=0; i<n; i++) {   
			int a=Integer.parseInt(br.readLine());
			bw.write(arr[a][0]+" "+arr[a][1]+"\n");
			
		}
		bw.close();
		
	}

}
