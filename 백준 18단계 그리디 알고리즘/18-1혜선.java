import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 동전0_내풀이 {
	static int N, K, A[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		A = new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println( recursion( K, A.length-1));
		
	}
	static int recursion(int curK, int idx) {
		if(idx <0) return 0;
		
		if(A[idx] > K )
			return recursion(curK, idx-1);
		
		int n = curK / A[idx];
		
		return n + recursion(curK-n*A[idx], idx-1);
	}
	static int loopFor() {
		int cnt=0, curK=K;
		for(int i=A.length-1; i>=0; i--) {
			if(A[i] > curK) continue;
			
			int n = curK / A[i];
			cnt += n;
			curK -= n * A[i];
		}
		return cnt;
	}
}
