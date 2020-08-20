import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer to = null;
		Stack<Integer> st = new Stack<Integer>();
		int num = Integer.parseInt(br.readLine());
		String[] arr ;
		int point = 0;
		for(int i=0; i<num; i++) {
			to = new StringTokenizer(br.readLine(), " ");
			arr = new String[to.countTokens()];
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = to.nextToken();
			}
			switch(arr[0]) {
			case "push":
				point = Integer.parseInt(arr[1]);
				st.push(point);
				break;
			case "pop":
				if(st.empty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(st.pop() + "\n");
				}
				break;
			case "size":
				bw.write(st.size() + "\n");
				break;
			case "empty":
				if(st.empty()) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
				break;
			case "top":
				if(st.empty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(st.peek() + "\n");
				}
				break;
			default:
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}