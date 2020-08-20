package saengsung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Mai {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		int num = Integer.parseInt(br.readLine());
		int point = 0;
		for(int i=0; i<num; i++) {
			point = Integer.parseInt(br.readLine());
			if(point == 0) {
				st.pop();
			}else {
				st.push(point);
			}
		}
		int sum = 0;
		for(int i=0; i<st.size(); i++) {
			sum += st.elementAt(i);
		}
		bw.write(sum+"\n");
		bw.flush();
		bw.close();
	}
}
