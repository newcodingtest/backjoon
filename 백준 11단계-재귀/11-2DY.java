//�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�.
//�� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
//�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
//n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� : ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//��� : ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
//10 -> 55
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dayeon11_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n<0||n>20) {
			System.out.println("�ٽ� �Է��ϼ���.");
			n = Integer.parseInt(br.readLine());
		}
		System.out.println(pibo(n));
	}
	public static int pibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return pibo(n-1)+pibo(n-2);
	}
}
