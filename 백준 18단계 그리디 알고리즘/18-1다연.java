// 13040KB, 84ms
package week12;

import java.io.*;
import java.util.*;

public class DY18_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] arr=  new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = n-1; i>=0; i--){// ���� 0�� �� ������ �ݺ�.
            if(m>=arr[i]){ 
            	// ���� ���� ū ������ ������ �Է� ���� ���� ��
            	// �Է¹��� ���� ũ�� ������.
                count += m/arr[i]; // ���� ���� ���� ����
                m = m%arr[i]; // �������� ���� �ٸ� ������ �ٲ� ��
            }         
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
