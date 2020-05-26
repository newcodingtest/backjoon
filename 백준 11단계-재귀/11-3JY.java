package fact;

import java.io.BufferedReader;
import java.io.IOException; // try catch �Ǵ� throws�� ���
import java.io.InputStreamReader;
import java.util.Arrays;

public class 11-3JY{
	
	static char arr[][];   //2������ �迭�� ����
	
	public static void test(int x, int y, int num) { //���ȣ�� �ݺ��� �޼���
		int div=0;
		
		if(num==1) {           //���ȣ�� ������ �κ�
			arr[x][y]='*';
			return;
		}
		
		div=num/3;
		
		for(int i=0; i<3; i++) {     //3x3�� ���� �����
			for(int j=0; j<3; j++) {
				if(i==1 && j==1) continue;          //���ǹ��� �ش�� �ݺ��κи� Ż���ϰ� ������ �ݺ��� ����
				test(x+(div*i),y+(div*j),div);  //�������� �Ű��ش� ex) 27�� �ԷµǸ� (0.0) ���� (0.9)�� �̵���
			}
		}
		
		
	}
	
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    int n=Integer.parseInt(br.readLine());
	    
	    arr=new char[n][n];
	    
	    for(int i=0; i<arr.length; i++) {
	    	Arrays.fill(arr[i], ' ');      //�� ���ǹ��� �ش��ϴ� �κ��� ��������ä��
	    }
	    
	    test(0,0,n);
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);    //�� ������ �迭���� ������ش�
	    }
	}
	
	}
	

	
	
		
