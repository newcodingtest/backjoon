package saengsung;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
class Main {
    public static void main(String args[]) throws Exception { // 메모리 34344KB, 시간 356ms
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int num = Integer.parseInt(br.readLine());
    	int index = 0;
    	HashSet<String> set = new HashSet<String>();
    	for(int i=0; i<num; i++) {
    		set.add(br.readLine());
    	}
    	String[] arr = new String[num];
    	ArrayList<String> list = new ArrayList<String>();
    	Iterator it = set.iterator();
    	while(it.hasNext()) {
    		String s = (String) it.next();
    		arr[index++] = s;
    	}
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] != null) {
    			list.add(arr[i]);
    		}
    	}
    	
    	Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 1;
				}else if(o2.length() > o1.length()) {
					return -1;
				}else {					
					return o1.compareTo(o2);
				}
			}		
    	});
    	for(String s : list) {
    		bw.write(s+"\n");
    	}
    	bw.flush();
    	bw.close();
    }
}