import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	static long[] arr = new long[91];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibo(n));
	}
	public static long fibo(int n) {
		arr[1] = 1;
		arr[0] = 0;
		for(int i = 2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
}