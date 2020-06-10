// ù° �ٿ� N�� M�� �־�����. N�� M�� 8���� ũ�ų� ����, 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ������ �� ���� ���°� �־�����. B�� �������̸�, W�� ����̴�.
// ù° �ٿ� �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢�� ������ �ּڰ��� ����Ѵ�.
package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DY13_4 {
	static final char[][] black = {
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
	};
	static final char[][] white = {
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
	};
	static char[][] trans = new char [8][8];
	static char array[][];
	public static int trans(int a, int b, int min) {
		int cnt_b=0;
		int cnt_w=0;
		int trans_min=0;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				trans[i][j] = array[a+i][b+j];
				if(trans[i][j]!=black[i][j]) {
//					System.out.print(i);
//					System.out.println(j);
					cnt_b++;
				}
				if(trans[i][j]!=white[i][j]) cnt_w++;				
			}
		}
		trans_min = (cnt_b>cnt_w) ? cnt_w : cnt_b;
		if(min>trans_min) min = trans_min;
		return min;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int i, j;
		array = new char [n][m];
		
		for(i=0;i<n;i++) {
			String str = bf.readLine();
			for(j = 0; j<m;j++) {
				array[i][j] = str.charAt(j);
			}
		}
		
		int min = n*m;
		for(i=0;i<=n-8;i++) {
			for(j=0; j<=m-8;j++) {
				min = trans(i,j,min);
			}
		}
		sb.append(min);
		System.out.println(sb);

	}

}
