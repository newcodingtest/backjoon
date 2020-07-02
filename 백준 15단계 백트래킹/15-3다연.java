// 입력 : 3 1 or 4 2(N, M 순 입력)
// (1 ≤ M ≤ N ≤ 7)
// 1부터 N까지 자연수 중에서 M개를 고른 수열
// 출력 : 1부터 3까지 자연수 중에서 1개를 고른 수열
//1
//2
//3
//출력2 : 1부터 4까지 자연수 중에서 2개를 고른 수열
//1 1
//1 2
//1 3
//1 4
//2 1
//2 2
//2 3
//2 4
//3 1
//3 2
//3 3
//3 4
//4 1
//4 2
//4 3
//4 4

package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DY15_3 {
	static int N;
	static int M;
	static int[] list;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void method(int cnt) throws IOException {
		if(cnt==M) {
			for(int i=0;i<M;i++) {
				bw.write(String.valueOf(list[i])+" ");
			}
			bw.newLine();
			return;
		}
		for(int i=1;i<=N;i++) {
			list[cnt] = i;
			method(cnt+1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//InputStreamReader, OutputStreamWriter 앞에 new 작성 잊지 말기
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//1부터 N까지 M의 길이의 모든 수열
		
		list = new int [M];
		method(0);

		bw.close();
		br.close();

	}

}
