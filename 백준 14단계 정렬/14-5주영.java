package back;
import java.io.*;
import java.io.IOException;
import java.util.*;


public class sort5 {   //�������� ����
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
        char[] arr=br.readLine().toCharArray(); //.toCharArray()=���ڹ迭�� ������
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--) {bw.write(arr[i]);} //�迭�� 0 1 2 3 ���� -1�� �ϸ� 3�������� �����Ѵ�
        
        bw.flush();
        
		
		
	}

}
