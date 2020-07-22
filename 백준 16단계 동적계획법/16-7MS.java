import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1] > arr[i]) {
				sum += arr[i+1];
			}
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}