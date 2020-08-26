package back;

import java.io.*;

public class Main { //메모리:13068 메모리:80
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<n; i++) {
            String result = isVPS(br.readLine()) ? "YES\n" : "NO\n";
            sb.append(result);
        }
        
        System.out.println(sb);
    }

    static boolean isVPS(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {             // 여는 괄호이면 
                count++;
            } else {                    //닫는 괄호이면
                if (count == 0) return false;
                count--;
            }
        }

        return count == 0;
    }
}