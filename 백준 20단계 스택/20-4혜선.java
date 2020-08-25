//30192KB, 384ms, 903B
import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상_내풀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String str;
		while (!(str = sc.nextLine()).equals(".")) // while(true)-if-break대신 사용
		{
			stack.clear();
			boolean balance = false;
			int i = 0;
			for (; i < str.length(); i++) {
				char c = str.charAt(i);
				if ( !(c=='(' || c=='[' || c==')' || c==']') ) continue;
				else if (c == '.') break;
				else if (c == '(' || c == '[') stack.push(c);
				else 
				{
					if (stack.isEmpty()) break;// 초기값이 false
					char top = stack.peek();
					if(top=='[' && c==']') stack.pop();
					else if(top=='(' && c==')') stack.pop();
					else
						break;//괄호모양이 안맞는 경우
				}
			} // for-i

			if (i == str.length() && stack.isEmpty())//스택이 비버야하는 조건 필수
				balance = true;

			String out = (balance) ? "yes" : "no";
			System.out.println(out);
		} // while
		sc.close();
	}

}
