package exam;


import java.util.Scanner;

public class hanoi {
	 static int n,count=0;
	 static StringBuilder sb=new StringBuilder();
	 
	 //n���� ������ from �������� by�� ���� to �� �ű�°�
	public static void test(int n, int from, int by, int to) {
		 count++;
		 if(n==1) { //������ 1���� ù��° from ���� 3��° to�� �̵�
			 sb.append(from+" "+to+"\n");
			 return;
		 }
		 else {  //������ 1���� �ƴϸ� 
			 test(n-1,from,to,by);     //�ι�° ������ 1 >3 >2 �� ����
			 sb.append(from+" "+to+"\n");
			 test(n-1,by,from,to);     //�ι�° ������ 2>1>3 �� ����
		 }
	 }
	 public static void main(String[] args)   {
			Scanner sc = new Scanner(System.in);
			
			n = sc.nextInt();
			test(n,1,2,3);
			System.out.println(count);
			System.out.println(sb);
			
		}
}
	