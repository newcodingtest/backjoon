package back;
import java.io.*;
/*
 ���� 123��° ����� �����ؼ� ��� ������ ����
  ����� �� ���� �� ��ܾ� �Ǵ� �� ��ܾ� ���� �� �ִ�. ��, �� ����� �����鼭 �̾ ���� ����̳�, ���� ���� ������� ���� �� �ִ�.
  ���ӵ� �� ���� ����� ��� ��Ƽ��� �� �ȴ�. ��, �������� ��ܿ� ���Ե��� �ʴ´�.
  ������ ���� ����� �ݵ�� ��ƾ� �Ѵ�.
  
  �Է�:����� ������ �־���  ����� ������ 300���� ����� ���ִ°��� 10000����
  
  
  ���:����� �������� ���� �� �ִ� �ִ밪�� ���϶�
  
  
  �����ʿ�!!!!!!!��Ÿ�� ���� �߻�!!!! ����� ������ 1���϶� ���ǹ��� �߰��ؾ���
  */ 


public class db6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int A[]=new int[N+1];       //��ܰ���
		int Value[]=new int[N+1];    //��ܿ� ���°�
	
		for(int i=1; i<=N; i++) {           //����� ������ �Է�
			A[i]=Integer.parseInt(br.readLine());
		}
		Value[1]=A[1];              //���� �̸� �˰��ִ� ������ ������ȹ�����
		Value[2]=Math.max(A[2],Value[1]+A[2]);
		
		for(int i=3; i<=N; i++) {                   //[5]�� ���� ��� (1,2,4,5 // 2,4,5 // 2,3,5 // 1,3,5)  *[2]�� ���������϶� (1,2,4,5)�� �ִ밪 *[3]�� �������϶� (2,3,5)�� �ִ밪
		Value[i]=Math.max(A[i]+Value[i-2],A[i]+A[i-1]+Value[i-3]);
			
		}	
		
			System.out.println(Value[N]);
	}

}
