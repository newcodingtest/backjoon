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

		StringTokenizer st = new StringTokenizer(str, "- "); // -부호 기준으로 자르기

		str = st.nextToken(); // 첫번째 토큰
		StringTokenizer st1 = new StringTokenizer(str, "+ "); // +부호 기준으로 자르기
		while (st1.hasMoreTokens()) {
			int ele = Integer.parseInt(st1.nextToken()); 
			result += ele; // 더해주기
		} 
		
		while (st.hasMoreTokens()) { // -부호 이후에 나오는 토큰이 있을 때
			str = st.nextToken();
			st1 = new StringTokenizer(str, "+ "); // +부호 기준으로 자르기
			while (st1.hasMoreTokens()) {
				int ele1 = Integer.parseInt(st1.nextToken());
				result -= ele1;  // 빼주기
			}
		}
		System.out.print(result);
	}
}
 