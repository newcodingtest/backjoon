// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
// 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
// 첫째 줄에 N!을 출력한다.
// 10 -> 3628800
import java.io.BufferedReader;
import java.io.IOException; // try catch 또는 throws에 사용
import java.io.InputStreamReader;

public class Dayeon11_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n<0||n>12) {
			System.out.println("범위에 어긋납니다. 다시 입력해주세요.");
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