package back;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class grid_4{

	static int result;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		result = 0;

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, "- "); // -��ȣ �������� �ڸ���

		str = st.nextToken(); // ù��° ��ū
		StringTokenizer st1 = new StringTokenizer(str, "+ "); // +��ȣ �������� �ڸ���
		while (st1.hasMoreTokens()) {
			int ele = Integer.parseInt(st1.nextToken()); 
			result += ele; // �����ֱ�
		} 
		
		while (st.hasMoreTokens()) { // -��ȣ ���Ŀ� ������ ��ū�� ���� ��
			str = st.nextToken();
			st1 = new StringTokenizer(str, "+ "); // +��ȣ �������� �ڸ���
			while (st1.hasMoreTokens()) {
				int ele1 = Integer.parseInt(st1.nextToken());
				result -= ele1;  // ���ֱ�
			}
		}
		System.out.print(result);
	}
}
 