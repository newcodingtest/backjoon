// 첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
// 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
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
