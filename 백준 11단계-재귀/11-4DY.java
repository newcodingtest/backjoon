package dy11_3;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main2 {
	public static int cnt=0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine());
		long start=System.currentTimeMillis();
		hanoi(num, 1, 2, 3);
		sb.insert(0, cnt+"\n");
		System.out.println(sb);
		long end=System.currentTimeMillis();
		double sbTime = (end-start)/1000.0;
		System.out.println("sbtime :"+sbTime);
	}
	
	public static void hanoi(int num, int from, int by, int to) {
		if(num==1) {
			sb.append(from+" "+to+"\n");
			cnt++;
		}
		else {
			hanoi(num-1, from, to, by);
			sb.append(from+" "+to+"\n");
			hanoi(num-1, by, from, to);
			cnt++;
		}
	}
}
