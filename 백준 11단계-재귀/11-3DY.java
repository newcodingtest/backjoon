package dy11_3;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
//	재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
//	크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
//	N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.
//	첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다. N은 3, 6, 9, 27 
//	첫째 줄부터 N번째 줄까지 별을 출력한다.
//  배열 설정해서 그 안에 *을 넣어주고 for문 출력 한줄하고 엔터 넣고 그렇게
//  1: 9*(***), 9*(* *)
//  1: 3*{(***)+("   ")+(***)}, 3*{(* *)+("   ")+(* *)}, 
//  1: 9*(***), 9*(* *),
//	2*3: 3*{3*(***)+3*("   ")+3*(***), 3*(* *)+3*("   ")+3*(* *)}
//  1*3:

	public static char[][] s_array;
	public static void main(String[] args) throws IOException {
		int i, j;
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		long start = System.currentTimeMillis();
		s_array = new char[num][num];
		for(i=0;i<s_array.length;i++) {
			Arrays.fill(s_array[i],' ');
		}
		star(0, 0, num);
		for(i=0;i<num;i++) {
			for(j=0;j<num;j++) {
				sb.append(s_array[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		long end = System.currentTimeMillis();
		double sbTime = (end-start) / 1000.0;
//		System.out.println("sbTime : " + sbTime);
	}
	
	public static void star(int x, int y, int num) {
		int i, j, num2;
		if(num==1) {
			s_array[x][y] = '*';
			return;
		}
		num2 = num/3;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i==1&&j==1);
				else {
					star(x+(i*num2), y+(j*num2), num2);
				}
			}
		}
		
	}

}
