// 44332KB, 448ms
package week12;

import java.io.*;
import java.util.*;
 
public class DY18_2 {
 
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
                //start[0], end[0] �迭�� arr[][] �� ù��° ����(���۽ð�)�̴�.
                //start[1], end[1] �迭�� arr[][] �� �ι�° ����(����ð�)�̴�.
                if(start[1]==end[1]){
                    //���� ���ϴ� ���� ����ð��� ���� ��� ���۽ð����� �����Ѵ�.
                    return Integer.compare(start[0], end[0]);
                }
                //����ð��� ���� �����Ѵ�.
                return Integer.compare(start[1], end[1]);
            } 
        });
      
        int count = 0;    // �ִ밪 ���� 
        int end = -1;    // �������� �ð��� ���� ����
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= end) {//���� ���۽ð��� ���� ����ð����� ���� ��� 
                end = arr[i][1];    //���� ����ð��� ���� ���۽ð��� ���ϱ����� ���� 
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}