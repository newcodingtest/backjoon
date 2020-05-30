import java.util.Scanner;

public class MS13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		sol(num);
	}
	public static void sol(int num) {
		int tmp = num;
		int result = 0;
		
		while(tmp > 0) {
			tmp--;
			
			int f1 = tmp;
			int f2 = tmp;
			while(f2 > 0) {
				f1 += f2%10;
				f2 /= 10;
			}
			if(f1 == num) {
				result = tmp;
			}
		}
		System.out.println(result);
	}
}
