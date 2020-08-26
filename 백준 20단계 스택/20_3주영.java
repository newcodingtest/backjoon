package back;

import java.io.*;

public class Main { //�޸�:13068 �޸�:80
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
            if (c == '(' || c == '[') {             // ���� ��ȣ�̸� 
                count++;
            } else {                    //�ݴ� ��ȣ�̸�
                if (count == 0) return false;
                count--;
            }
        }

        return count == 0;
    }
}