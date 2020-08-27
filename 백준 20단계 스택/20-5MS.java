package saengsung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Mai {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		ArrayList<String> list = new ArrayList<String>();
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		int cnt = 0;
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=1; i<=num; i++) {
			st.push(i);
			list.add("+");
			while(!st.isEmpty() && arr[cnt] == (int) st.peek()) {
				cnt++;
				st.pop();
				list.add("-");
			}
		}
		if(!st.isEmpty()) {
			System.out.println("NO");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
}
