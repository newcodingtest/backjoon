package back;
import java.io.*;
/*
 �Է�: ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

          �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. N�� 40���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 
 ���: �� �׽�Ʈ ���̽����� 0�� ��µǴ� Ƚ���� 1�� ��µǴ� Ƚ���� �������� �����ؼ� ����Ѵ�.
 
 3                           
 0                1 0
 1                0 1
 3                1 2 
 
 */

public class fab2 { //�޸�:13064  �ð�:80
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int [][] arr=new int[41][2];   //0~40���� �о����
		arr[0][0]=1;  //n�� 0�϶� 0�� ���� 1
		arr[1][1]=1;  //n�� 1�϶� 1�� ���� 1
		
		for(int i=2; i<41; i++) {  // ��Ģ�� n-2���� ���⶧���� ������ ���ϱ� ���ؼ� i=2 ���� �����ؾ���
			for(int j=0; j<2; j++) {
				arr[i][j]=arr[i-1][j]+arr[i-2][j];
			}
		}
		for(int i=0; i<n; i++) {   
			int a=Integer.parseInt(br.readLine());
			bw.write(arr[a][0]+" "+arr[a][1]+"\n");
			
		}
		bw.close();
		
	}

}
