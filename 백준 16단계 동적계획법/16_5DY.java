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
		int a[][] = new int[n+1][3]; // ���� ����
		int d[][] = new int[n+1][3]; // ���� ĥ���� ���� �ּڰ�
		
		for(int i=1;i<n+1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i][0]=Integer.parseInt(st.nextToken()); // R
			a[i][1]=Integer.parseInt(st.nextToken()); // G
			a[i][2]=Integer.parseInt(st.nextToken()); // B
		}
		
		// �迭 n+1�� ������ �迭 0��°�� �ƴ� 1��°���� �� �ο�. ���� 0��°�� 0���� �ʱ�ȭ
		d[0][0] = d[0][1] = d[0][2] = a[0][0] = a[0][1] = a[0][2] = 0;
		
		for(int i=1;i<n+1;i++) {
			// R�� ä���� �������� G Ȥ�� B�� ä������ ���� �ּ� ��뿡 R�� ä������ ���� �ּ� ��� ����
			d[i][0] = Min(d[i-1][1], d[i-1][2])+a[i][0];
			// G�� ä���� �������� R Ȥ�� B�� ä������ ���� �ּ� ��뿡 G�� ä������ ���� �ּ� ��� ����
			d[i][1] = Min(d[i-1][0], d[i-1][2])+a[i][1];
			// B�� ä���� �������� R Ȥ�� G�� ä������ ���� �ּ� ��뿡 B�� ä������ ���� �ּ� ��� ����
			d[i][2] = Min(d[i-1][0], d[i-1][1])+a[i][2];
		}
		
		// RGB �������� �� �� �ּҰ� ��ȯ�ؼ� ���
		bw.write(String.valueOf(Min(Min(d[n][0], d[n][1]), d[n][2])));
		bw.flush();
		bw.close();

	}

	public static int Min(int a, int b) {
		return a<b?a:b;
	}

}
