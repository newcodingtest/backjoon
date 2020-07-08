package back;


/* 입력:아홉 줄에 걸쳐 한 줄에 9개씩 게임 시작 전 스도쿠판 각 줄에 쓰여 있는 숫자가 한 칸씩 띄워서 차례로 주어진다. 
스도쿠 판의 빈 칸의 경우에는 0이 주어진다. 스도쿠 판을 규칙대로 채울 수 없는 경우의 입력은 주어지지 않는다.

출력:모든 빈 칸이 채워진 스도쿠 판의 최종 모습을 아홉줄에 걸쳐 한 줄에 9개씩 한 칸씩 띄워서 출력한다.
스도쿠 판을 채우는 방법이 여럿인 경우는 그 중 하나만을 출력한다.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class sort5 { //메모리:16732 시간 365
    public static final int size = 9;
    public static int[][] arr;
    
    public static List<int[]> list;
    public static boolean isEnd;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = null;   // 널값으로 구분
        
        arr = new int[size][size];
        list = new ArrayList<>();
        
        for(int i=0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                
                if(arr[i][j] == 0) list.add(new int[] {i, j});
            }
        }
        // 입력 완료 
        backtracking(0, 0);
        
    }
    public static void backtracking(int idx, int cnt) {
        // 결과가 나왔다면 조회할 필요가 없다.
        if(isEnd) return;
        
        //빈칸에 입력된 cnt가 초기 zero 값의 cnt와 같다면 전부 입력이 된것.
        if(cnt == list.size()) {
            isEnd = true;
            print();
            return;
        }
        // 인덱스가 list크기를 넘어가면 종
        if(idx >= list.size()) return;
        
        int y = list.get(idx)[0];
        int x = list.get(idx)[1];
        
        // 1 부터 9 까지 입력 가능한 숫자 를 확인한다.
        for(int i=1; i<=9; i++) {
            // 해당 숫자가 가능하면 해당 좌표에 값을 입력하고 backtracking을 한다. 
            if(isAble(y, x, i)) {
                arr[y][x] = i;
                backtracking(idx+1, cnt+1);
                arr[y][x] = 0;
            }
        }
        
    }
    
    public static void print() {
        // 결과 출력
                StringBuilder sb = new StringBuilder();
                for(int i=0; i < size; i++) {
                    for(int j=0; j < size; j++) {
                        sb.append(arr[i][j] + " ");
                    }
                    sb.append("\n");
                }
                System.out.println(sb.toString());
    }
    public static boolean isAble(int y, int x, int v) {
        for(int i=0; i < size; i++) {
            // 가로가 유효한지 arr[y][x]의 값이 가로에 또 존재하면 안된다.
            if(arr[y][i] == v) return false;
            
            // 세로가 유효한지 arr[y][x]의 값이 세로에 또 존재하면 안된다.
            if(arr[i][x] == v) return false;
        }
        
        // 3*3이 유효한지
        int y_s = y/3 * 3;
        int x_s = x/3 * 3;
        for(int i = y_s; i < y_s+3; i++) {
            for(int j = x_s; j < x_s+3; j++) {
                if(arr[i][j] == v) return false;
            }
        }
        return true;
    }
}



