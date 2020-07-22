package back;
import java.io.*;
/*
 조건 123번째 계단을 연속해서 모두 밝을순 없음
  계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
  연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
  마지막 도착 계단은 반드시 밟아야 한다.
  
  입력:계단의 개수를 주어짐  계단의 개수는 300이하 계단의 쓰있는값은 10000이하
  
  
  출력:계단을 오를때의 얻을 수 있는 최대값을 구하라
  
  
 
  */


public class db6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int A[]=new int[N+1];
		int Value[]=new int[N+1];
	
		for(int i=1; i<=N; i++) {           //계단의 개수를 입력
			A[i]=Integer.parseInt(br.readLine());
		}
		Value[1]=A[1];              //값을 미리 알고있는 값들은 동적계획법사용
		Value[2]=Math.max(A[2],Value[1]+A[2]);
		
		for(int i=3; i<=N; i++) {                   //[5]를 예로 들면 (1,2,4,5 // 2,4,5 // 2,3,5 // 1,3,5)  *[2]가 마지막일일땐 (1,2,4,5)가 최대값 *[3]이 마지막일땐 (2,3,5)가 최대값
		Value[i]=Math.max(A[i]+Value[i-2],A[i]+A[i-1]+Value[i-3]);
			
		}	
		
			System.out.println(Value[N]);
	}

}
