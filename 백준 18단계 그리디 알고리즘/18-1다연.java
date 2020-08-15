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
        
        for(int i = n-1; i>=0; i--){// 돈이 0이 될 때까지 반복.
            if(m>=arr[i]){ 
            	// 동전 제일 큰 값부터 시작해 입력 받은 값과 비교
            	// 입력받은 값이 크면 나눈다.
                count += m/arr[i]; // 나눈 값은 동전 개수
                m = m%arr[i]; // 나머지는 다음 다른 돈으로 바꿀 돈
            }         
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
