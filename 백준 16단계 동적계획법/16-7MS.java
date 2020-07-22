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
		int[] arr = new int[n+1];
		int[] tmp = new int[n+1];
		for(int i=1; i<=n; i++) {
			tmp[i] = Integer.parseInt(br.readLine());
		}
		arr[0] = 0;
		tmp[0] = 0;
		arr[1] = tmp[1];
		arr[2] = Math.max(arr[1] + tmp[2], tmp[2]);
		for(int i=3; i<=n; i++) {
			arr[i] = Math.max(arr[i-2]+tmp[i] , tmp[i-1] + arr[i-3] + tmp[i]);
		}
		bw.write(arr[n] + "\n");
		bw.flush();
		bw.close();
	}
}
