package week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DY16_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(pivo(n)));
		bw.flush();
		bw.close();

	}

	private static long pivo(int num) {
		long [] array = new long [num+1];

		if(num>0) {
			array[1] = 1;		
		}
		
		for(int i=2; i<num+1;i++) {
			array[i] = array[i-1]+array[i-2];
		}
		return array[num];
	}

}

// int로 하면 90되는 순간 음수된다.
