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
            String str = Integer.toString(num);   // ī���õǴ� num���� string ������ ��ȯ
 
            if(str.contains("666")) //string������ ��ȯ�� num���� 666�����ϸ� (N-1)666 ���� ��µ� 
                N--;
        }
 
        System.out.println(num);
    }
}