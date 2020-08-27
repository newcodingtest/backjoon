package saengsung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//push X: ���� X�� ť�� �ִ� �����̴�.
//pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ť�� ����ִ� ������ ������ ����Ѵ�.
//empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
public class Mai {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new LinkedList<Integer>();
		StringTokenizer st = null;
		String[] arr;
		int last = 0;
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr = new String[st.countTokens()];
			for(int j=0; j<arr.length; j++) {
				arr[j] = st.nextToken();
			}
			switch(arr[0]) {
			case "push"://
				last = Integer.parseInt(arr[1]);
				queue.add(Integer.parseInt(arr[1]));
				break;
			case "front"://
				if(!queue.isEmpty())
					bw.write(queue.peek() + "\n");
				else
					bw.write(-1 +"\n");
				break;
			case "pop":
				if(!queue.isEmpty())
					bw.write(queue.poll() + "\n");
				else
					bw.write(-1 +"\n");
				break;
			case "size":
				bw.write(queue.size() + "\n");
				break;
			case "empty":
				if(queue.isEmpty()) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(last + "\n");
				}
				break;
			default :
				break;
			}
		}
		bw.flush();
		bw.close();
		
	}
}
