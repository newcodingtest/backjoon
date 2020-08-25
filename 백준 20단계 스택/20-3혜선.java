import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ��ȣ_��Ǯ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++) 
		{
			String str = br.readLine();
			
			//���ÿ� �� ���� '('���� 1�����̹Ƿ� Stack�ڷᱸ������ �ڿ����� ǥ��
			String out1 = (noStack_cntC(str)) ? "YES" : "NO";
			
			//���� �ڷᱸ�� ���
//			String out2 = (useStack(str)) ? "YES" : "NO";
			
			System.out.println(out1);
//			System.out.println(out2);
		}
		
	}
//	13084KB, 88ms, 771B	
	static boolean noStack_cntC(String str) {
		int cntC = 0, j=0;
		for(; j<str.length(); j++) {
			char c = str.charAt(j);
			if(c == '(') cntC++;
			else {//')' �Էµ�
				if(cntC ==0) return false;
				else
					cntC--;
			}
		}//for-j
		if(j==str.length() && cntC==0) 
			return true;
		return false;
	}
	
//13164KB, 92ms, 870B
	static boolean useStack(String str) {
		Stack <Character> stack = new Stack<>();
		for(int j=0; j<str.length(); j++) {
			char c = str.charAt(j);
			if(c=='(') stack.push('(');
			else
			{
//				if(stack.isEmpty()) return false;
//				stack.pop();
				if( !stack.isEmpty()) stack.pop();
			}
		}
		if(stack.isEmpty()) return true;
		return false;
	}

}
