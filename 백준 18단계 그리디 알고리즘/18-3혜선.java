//13344KB, 88ms, 731B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
	각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 = 처리시간(고정) + 대기시간의 최솟값
	짧은처리시간 우선순위 -> 대기시간감소 -> 오름차순정렬
	n번째대기시간 =  0번 ~바로앞순번까지의 총누적대기시간의 누적합
*/
public class ATM_내풀이 {
	static int N, P[], minTime=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		P = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<P.length; i++) P[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(P);//오름차순정렬 
		
		int size = P.length;
		for(int i=0; i<P.length; i++) {
			minTime += size * P[i];
			size--;
		}
		System.out.println(minTime);
	}

}
