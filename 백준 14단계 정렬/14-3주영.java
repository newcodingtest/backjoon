package back;
import java.io.*;
import java.util.Arrays;

public class sort3 { 
	public static void main(String[] args) throws IOException { //������������ ����
	    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());  //n���� ���� �־�������
		int[] arr = new int[N];                   //n�迭 ���� 
        
		for(int i = 0; i < N; i++){               //n�� �����鼭
			arr[i] = Integer.parseInt(br.readLine());  //�迭���� ���� int������ �д´�
		}
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++){                      //�迭���� ������Ű�鼭 ��� < ��������
			sb.append(arr[i]).append('\n');
		}
 
		System.out.println(sb);
	}
}