package test3;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				star(i, j, num);
			}
			System.out.println();
		}
	}

	public static void star(int x, int y, int num) {
		if ((x / num) % 3 == 1 && (y / num) % 3 == 1) {
			System.out.print(" ");
		} else if (num / 3 == 0) {
			System.out.print("*");
		}else{
			star(x,y,num/3);
		}
	}
}
