package back;
import java.io.*;

/*
  ACAYKP
  CAPCAK
  �μ������� ���������� �����ִ� ���� �� �κ� ������ ���̸� ���϶�
  
  - AAK
  - CAK
  - ACAK
  https://www.youtube.com/watch?v=P-mMvhfJhu8&feature=emb_title
  https://jaesungbong.tistory.com/21
    0 A C A Y K P
  0 0 0 0 0 0 0 0  
  C 0 0 1 1 1 1 1
  A 0 1 1 2 2 2 2
  P 0 1 1 2 2 2 3
  C 0 1 2 2 2 2 3
  A 0 1 2 3 3 3 3
  K 0 1 2 3 3 4 4
  
  
  
 * */

public class dp14 { //�޸�:17420   //�ð�:120
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	String a=br.readLine();
	String b=br.readLine();
	
	int [][]arr=new int[a.length()+1][b.length()+1];
	
	for(int i=1; i<=a.length(); i++) {
		for(int j=1; j<=b.length(); j++) {
			if(a.charAt(i-1)!=b.charAt(j-1)) { arr[i][j]=Math.max(arr[i][j-1], arr[i-1][j]); //���ڰ� ���� ���� ��쿡�� �ش� ��ġ���� ���� ��� ���� ���� ��(���� ���� ���� ��)�� �ִ밪�� �����Ѵ�.  
			} else {arr[i][j]=arr[i-1][j-1]+1;//, ���� ������ ��쿡�� ���� + ���ش�
			}
		}
	}
	
	System.out.println(arr[a.length()][b.length()]);
	
	}
}

