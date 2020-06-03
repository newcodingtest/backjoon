package back;
import java.util.Scanner;
 
public class brute4 {
    private static char[][] BOARD;
    private static char[][] WB;
    
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		WB = new char[2][8];
		WB[0] = "WBWBWBWB".toCharArray(); //흰색이 첫번째 흰색좌표들 합은 짝수 검은색은 홀수
		WB[1] = "BWBWBWBW".toCharArray(); //검은색이 첫번째
		
		BOARD = new char[n][m];
		for(int i = 0; i < n; i++) {
		    BOARD[i] = scan.nextLine().toCharArray();
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n - 7; i++) {
		    for(int j = 0; j < m - 7; j++) {
		        min = Math.min(min, draw(i, j));
		    }
		}
		System.out.println(min);
    }
    
    private static int draw(int y, int x) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < WB.length; i++) {
            int cnt = 0;
            for(int j = 0; j < WB[0].length; j++) {
                for(int k = 0; k < WB[0].length; k++) {
                    if(BOARD[y+j][x+k] != WB[(i+j)%2][k]) { //위의 88 체스판이랑 다르면 갯수를 세준다
                        cnt++;
                    }
                }
            }
            min = Math.min(min, cnt);
        }
        return min;
    }
}