package back;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class brute5{

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
        int num = 0;
 
        while(N > 0) {
            num++;
            String str = Integer.toString(num);   // 카운팅되는 num값을 string 형으로 변환
 
            if(str.contains("666")) //string형으로 변환된 num값이 666포함하면 (N-1)666 으로 출력됨 
                N--;
        }
 
        System.out.println(num);
    }
}