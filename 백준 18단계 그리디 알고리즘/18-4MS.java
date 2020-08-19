import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), "-", false);
		int result = 0;
		int sum = 0;
		int token = 0;
		int cnt = st1.countTokens();

		for (int i = 0; i < cnt; i++) {
			StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");

			while (st2.hasMoreTokens()) {
				token = Integer.parseInt(st2.nextToken());
				sum += token;
			}
			if (i == 0) {
				result = sum;
				sum = 0;
			} else {
				result -= sum;
				sum = 0;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}