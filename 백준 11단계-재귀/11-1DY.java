// 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
// ù° �ٿ� N!�� ����Ѵ�.
// 10 -> 3628800
import java.io.BufferedReader;
import java.io.IOException; // try catch �Ǵ� throws�� ���
import java.io.InputStreamReader;

public class Dayeon11_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n<0||n>12) {
			System.out.println("������ ��߳��ϴ�. �ٽ� �Է����ּ���.");
			n = Integer.parseInt(br.readLine());
		}
		System.out.println(factorial(n));
	}
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
//		int fact = 1;
//		for(int i = 1; i<=num; i++) {
//			fact = i*fact;
//		}
//		return fact;
	}
}