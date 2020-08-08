package week7;
// 13600KB, 92ms
// https://m.blog.naver.com/occidere/220785383050
import java.io.*;
import java.util.StringTokenizer;

public class DY16_5 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int a[][] = new int[n+1][3]; // 집과 색깔
		int d[][] = new int[n+1][3]; // 집을 칠했을 때의 최솟값
		
		for(int i=1;i<n+1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i][0]=Integer.parseInt(st.nextToken()); // R
			a[i][1]=Integer.parseInt(st.nextToken()); // G
			a[i][2]=Integer.parseInt(st.nextToken()); // B
		}
		
		// 배열 n+1로 설정해 배열 0번째가 아닌 1번째부터 값 부여. 따라서 0번째는 0으로 초기화
		d[0][0] = d[0][1] = d[0][2] = a[0][0] = a[0][1] = a[0][2] = 0;
		
		for(int i=1;i<n+1;i++) {
			// R로 채색시 이전까지 G 혹은 B로 채색했을 때의 최소 비용에 R로 채색했을 때의 최소 비용 더함
			d[i][0] = Min(d[i-1][1], d[i-1][2])+a[i][0];
			// G로 채색시 이전까지 R 혹은 B로 채색했을 때의 최소 비용에 G로 채색했을 때의 최소 비용 더함
			d[i][1] = Min(d[i-1][0], d[i-1][2])+a[i][1];
			// B로 채색시 이전까지 R 혹은 G로 채색했을 때의 최소 비용에 B로 채색했을 때의 최소 비용 더함
			d[i][2] = Min(d[i-1][0], d[i-1][1])+a[i][2];
		}
		
		// RGB 세가지의 값 중 최소값 반환해서 출력
		bw.write(String.valueOf(Min(Min(d[n][0], d[n][1]), d[n][2])));
		bw.flush();
		bw.close();

	}

	public static int Min(int a, int b) {
		return a<b?a:b;
	}

}
