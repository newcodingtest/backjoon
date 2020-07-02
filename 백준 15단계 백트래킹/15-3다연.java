// �Է� : 3 1 or 4 2(N, M �� �Է�)
// (1 �� M �� N �� 7)
// 1���� N���� �ڿ��� �߿��� M���� �� ����
// ��� : 1���� 3���� �ڿ��� �߿��� 1���� �� ����
//1
//2
//3
//���2 : 1���� 4���� �ڿ��� �߿��� 2���� �� ����
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
		//InputStreamReader, OutputStreamWriter �տ� new �ۼ� ���� ����
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//1���� N���� M�� ������ ��� ����
		
		list = new int [M];
		method(0);

		bw.close();
		br.close();

	}

}
