package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DY15_4 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int list[];
	static int n;
	static int m;
	
	private static void method(int cnt) throws IOException {
		// throws IOException �߰�
		if(cnt==m) {
			for(int i =0;i<m;i++) {
				bw.write(String.valueOf(list[i])+" "); //String.valueOf ��������
			}
			bw.write("method"+String.valueOf(cnt));
			bw.newLine();
			return; // return �߰��ؼ� ����
		}
		
		for(int i=(cnt==0)?1:list[cnt-1];i<=n;i++) {
			list[cnt] = i;
			method(cnt+1);
			bw.write("methodtest"+String.valueOf(cnt));
			bw.newLine();
		}		
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		list = new int [m];
		
		method(0);
		
		bw.flush();
		bw.close();
	}

}
