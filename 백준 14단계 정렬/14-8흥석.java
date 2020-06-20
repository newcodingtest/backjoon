import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        ArrayList<String> list = new ArrayList<String>(set);

        Collections.sort(list, new sorting());
        for (String s : list)
            System.out.println(s);
    }
}

class sorting implements Comparator<String> {
    public int compare(String v1, String v2) {
        if (v1.length() > v2.length())
            return 1;
        else if (v1.length() < v2.length())
            return -1;
        else
            return v1.compareTo(v2);
    }
}