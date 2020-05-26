package dy11_3;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
//	������� �������� ���� ��� ����. N�� 3�� �ŵ�����(3, 9, 27, ...)�̶�� �� ��, ũ�� N�� ������ N��N ���簢�� ����̴�.
//	ũ�� 3�� ������ ����� ������ �ְ�, ����� ������ ��� ĭ�� ���� �ϳ��� �ִ� �����̴�.
//	N�� 3���� Ŭ ���, ũ�� N�� ������ �������� ä���� ����� (N/3)��(N/3) ���簢���� ũ�� N/3�� �������� �ѷ��� �����̴�. ���� ��� ũ�� 27�� ������ ���� ��� 1�� ����.
//	ù° �ٿ� N�� �־�����. N�� 3�� �ŵ������̴�. �� � ���� k�� ���� N=3k�̸�, �̶� 1 �� k < 8�̴�. N�� 3, 6, 9, 27 
//	ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.
//  �迭 �����ؼ� �� �ȿ� *�� �־��ְ� for�� ��� �����ϰ� ���� �ְ� �׷���
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
