//30192KB, 384ms, 903B
import java.util.Scanner;
import java.util.Stack;

public class ������������_��Ǯ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String str;
		while (!(str = sc.nextLine()).equals(".")) // while(true)-if-break��� ���
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
					if (stack.isEmpty()) break;// �ʱⰪ�� false
					char top = stack.peek();
					if(top=='[' && c==']') stack.pop();
					else if(top=='(' && c==')') stack.pop();
					else
						break;//��ȣ����� �ȸ´� ���
				}
			} // for-i

			if (i == str.length() && stack.isEmpty())//������ ������ϴ� ���� �ʼ�
				balance = true;

			String out = (balance) ? "yes" : "no";
			System.out.println(out);
		} // while
		sc.close();
	}

}
