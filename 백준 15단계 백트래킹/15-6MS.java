package algo;
import java.util.LinkedList;
import java.util.Scanner;

public class Test{ //21552kb  528ms
	static int[][] map;
	static LinkedList<int[]> list = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		map = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 0) {
					list.add(new int[] { i, j });
				}
			}
		}
		sol(0);
	}

	private static void sol(int depth) {
		if (depth == list.size()) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(map[i][j]).append(" ");
				}
				sb.append("\n");
			}
			sb.append("\n");

			System.out.println(sb);
			System.exit(0);
		}

		int r = list.get(depth)[0];
		int c = list.get(depth)[1];

		for (int i = 1; i <= 9; i++) {
			if (check(r, c, i)) {
				map[r][c] = i;
				sol(depth + 1);
				map[r][c] = 0;
			}
		}

	}

	private static boolean check(int r, int c, int num) {
		if (map[r][c] != 0)
			return false;

		for (int i = 0; i < 9; i++) {
			if (map[i][c] == num || map[r][i] == num)
				return false;
		}
		int sr = (r / 3) * 3, sc = (c / 3) * 3;
		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if (map[i][j] == num) //
					return false;
			}
		}
		return true;
	}
}