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
                //start[0], end[0] 배열은 arr[][] 의 첫번째 라인(시작시간)이다.
                //start[1], end[1] 배열은 arr[][] 의 두번째 라인(종료시간)이다.
                if(start[1]==end[1]){
                    //만약 비교하는 값의 종료시간이 같을 경우 시작시간으로 정렬한다.
                    return Integer.compare(start[0], end[0]);
                }
                //종료시간에 따라 정렬한다.
                return Integer.compare(start[1], end[1]);
            } 
        });
      
        int count = 0;    // 최대값 변수 
        int end = -1;    // 다음시작 시간과 비교할 변수
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= end) {//현재 시작시간이 이전 종료시간보다 늦을 경우 
                end = arr[i][1];    //현재 종료시간을 다음 시작시간과 비교하기위해 저장 
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}