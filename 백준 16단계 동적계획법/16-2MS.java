import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 13016kb, 84ms
	static int arr[];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		int n = Integer.parseInt(br.readLine());
		fibo(n);
	}

	public static void fibo(int n) throws NumberFormatException, IOException{
		arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		long[] zero = new long[41];
		zero[0] = 1;
		zero[1] = 0;
		long[] one = new long[41];
		one[0] = 0;
		one[1] = 1;
		for(int i=2; i<41; i++){
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(zero[arr[i]] + " " + one[arr[i]]);
		}
	}
}