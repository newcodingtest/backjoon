package back;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort8{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1)
		int N = scan.nextInt();
		String[][] sArr = new String[N][2];	
		
		for(int i=0; i<N; i++) {
			sArr[i][0] = scan.next();	// 나이
			sArr[i][1] = scan.next();	// 이름
		}
		
		// 2)
		Arrays.sort(sArr, new Comparator<String[]>() {

			@Override
			public int compare(String[] a, String[] b) {
				return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
			}
		});
		
		for(int i=0; i<N; i++)
			System.out.println(sArr[i][0] + " " + sArr[i][1]);
		
		scan.close();
	}

}