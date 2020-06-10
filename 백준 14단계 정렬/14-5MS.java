import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		int num = Integer.parseInt(br.readLine());
		int tmp = 0;
		while(num > 0) {
			tmp = num % 10;
			num /= 10;
			list.add(tmp);
		}
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
}