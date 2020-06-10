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
		for(int i=0; i<num; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) > 0) {
				bw.write(list.get(i) + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
