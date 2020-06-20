package week5;
// 32560KB, 1564ms
import java.io.*;
import java.util.*;
public class DY14_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<String> word = new ArrayList<String>(20001); 
		for(int i =0; i<n; i++){ 
			String temp= br.readLine(); 
			if(!word.contains(temp)) word.add(temp);
			// if문이랑, 배열 20000 부분 수정 후 메모리, 시간 측정
		} 
		
		Comparator<String> myComparator = new Comparator<String>() { 
			public int compare(String x, String y) { 
				if(x.length()>y.length()){ 
					return 1; 
				} 
				else if(x.length()==y.length()){ 
					return x.compareTo(y); 
				}
				return -1; 
			} 
		}; 
		
		Collections.sort(word, myComparator); 
		
		for(int i =0; i<word.size(); i++){
			bw.write(word.get(i)+"\n");
		}
		bw.close();
	}

}
