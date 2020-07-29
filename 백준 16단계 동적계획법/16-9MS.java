package saengsung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mai {
	static long[][] arr = new long[100][9];
	static long cnt = 0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(br.readLine());
			sol(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void sol(int num) {
		for(int i=0; i<9; i++) {
			arr[0][i] = 1;
			if(i == 8) {
				arr[1][i] = 1;
			}else {
				arr[1][i] = 2;
			}
		}
		if(num>2) {
			for(int i=2; i<num; i++) {
				for(int j=0; j<9; j++) {
					if(j==0) {
						arr[i][j] = (arr[i-2][j] + arr[i-1][j+1]) % 1000000000;
					}else if(j==8) {
						arr[i][j] = arr[i-1][j-1] % 1000000000;
					}else {
						arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000;
					}
				}
			}
		}
		for(int i=0; i<9; i++) {
			cnt += arr[num-1][i];
		}
		try {
			bw.write(String.valueOf(cnt % 1000000000));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
