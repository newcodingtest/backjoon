package saengsung;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
//55056KB, 648ms
class Person implements Comparable<Person>{
	int age;
	String name;
	int cnt;
	public Person(int age, String name, int cnt) {
		this.age = age;
		this.name = name;
		this.cnt = cnt;
	}
	@Override
	public int compareTo(Person o) {
		if(age > o.age) {
			return 1;
		}else if( age == o.age && cnt > o.cnt) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class Main {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Person[] s = new Person[num];
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			s[i] = new Person(age, name,cnt);
			cnt++;
		}
		Arrays.sort(s);
		for(Person p : s) {
			if(p != null)
				bw.write(p.age + " " + p.name+"\n");
		}
		bw.flush();
		bw.close();
	}
}
