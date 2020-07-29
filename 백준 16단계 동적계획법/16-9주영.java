package back;

import java.io.*;

/* 쉬운 계단 수
[문제:         ]
45656이란 수를 보자.

이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.

세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.) 
  
[입려:         ]  
 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 
[출력:         ]
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다. 
  
  
 
 메모리:13048 시간:80    */  

public class dp9 {    //점화식 arr[i][j]+=arr[i-1][j-1]+arr[i-1][j+1]
	    static int N;
	    
	    static long arr[][];
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N=Integer.parseInt(br.readLine());
		arr= new long[101][11];
		
		arr[1][0]=0;                //길이 1 끝자리 0 이면 0개
		
		for(int i=1; i<=10; i++) {    
			arr[1][i]=1;           //길이가 1 이면 0제외하고는 1개
			}
		
		for(int i=2; i<=N; i++) {     //길이 2~n까지 계단수 카운팅
			for(int j=0; j<10; j++) { 
				if(j==0) {            //끝자리가 0으로 끝나면
					arr[i][j]+=(arr[i-1][j+1]%1000000000);  //
				}
				else if(j>0 && j<9) { // 끝자리가 1~8 로 끝나면
					arr[i][j]+=(arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
				}
				else arr[i][j]+=(arr[i-1][j-1]%1000000000);
				
			}
			}
		
		long result=0;
		for(int i=0; i<10; i++) {
			result+=arr[N][i];
		}
		bw.write(String.valueOf(result%1000000000));
		bw.flush();
		bw.close();
		bw.close();
	
		
		}
		}