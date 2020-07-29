package back;

import java.io.*;

/* ���� ��� ��
[����:         ]
45656�̶� ���� ����.

�� ���� ������ ��� �ڸ����� ���̰� 1�� ����. �̷� ���� ��� ����� �Ѵ�.

�����̴� ���� ���̰� N�� ��� ���� �� �� �ִ��� �ñ�������.

N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� �����ϴ� ���� ����.) 
  
[�Է�:         ]  
 ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
 
[���:         ]
ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�. 
  
  
 
 �޸�:13048 �ð�:80    */  

public class dp9 {    //��ȭ�� arr[i][j]+=arr[i-1][j-1]+arr[i-1][j+1]
	    static int N;
	    
	    static long arr[][];
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N=Integer.parseInt(br.readLine());
		arr= new long[101][11];
		
		arr[1][0]=0;                //���� 1 ���ڸ� 0 �̸� 0��
		
		for(int i=1; i<=10; i++) {    
			arr[1][i]=1;           //���̰� 1 �̸� 0�����ϰ�� 1��
			}
		
		for(int i=2; i<=N; i++) {     //���� 2~n���� ��ܼ� ī����
			for(int j=0; j<10; j++) { 
				if(j==0) {            //���ڸ��� 0���� ������
					arr[i][j]+=(arr[i-1][j+1]%1000000000);  //
				}
				else if(j>0 && j<9) { // ���ڸ��� 1~8 �� ������
					arr[i][j]+=(arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
				}
				else arr[i][j]+=(arr[i-1][j-1]%1000000000);
				
			}
			}
		
		long result=0;
		for(int i=0; i<10; i++) {
			result+=arr[N][i];
		}
		bw.write(String.valueOf(result%1000000000));
		bw.flush();
		bw.close();
		bw.close();
	
		
		}
		}