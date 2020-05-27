package exam;


import java.util.Scanner;

public class hanoi {
	 static int n,count=0;
	 static StringBuilder sb=new StringBuilder();
	 
	 //n개의 원판을 from 에서부터 by를 지나 to 로 옮기는것
	public static void test(int n, int from, int by, int to) {
		 count++;
		 if(n==1) { //원판이 1개면 첫번째 from 에서 3번째 to로 이동
			 sb.append(from+" "+to+"\n");
			 return;
		 }
		 else {  //원판이 1개가 아니면 
			 test(n-1,from,to,by);     //두번째 원판을 1 >3 >2 로 전달
			 sb.append(from+" "+to+"\n");
			 test(n-1,by,from,to);     //두번째 원판을 2>1>3 로 전달
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
	