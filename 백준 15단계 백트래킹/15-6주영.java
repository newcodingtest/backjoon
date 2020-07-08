package back;


/* �Է�:��ȩ �ٿ� ���� �� �ٿ� 9���� ���� ���� �� �������� �� �ٿ� ���� �ִ� ���ڰ� �� ĭ�� ����� ���ʷ� �־�����. 
������ ���� �� ĭ�� ��쿡�� 0�� �־�����. ������ ���� ��Ģ��� ä�� �� ���� ����� �Է��� �־����� �ʴ´�.

���:��� �� ĭ�� ä���� ������ ���� ���� ����� ��ȩ�ٿ� ���� �� �ٿ� 9���� �� ĭ�� ����� ����Ѵ�.
������ ���� ä��� ����� ������ ���� �� �� �ϳ����� ����Ѵ�.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class sort5 { //�޸�:16732 �ð� 365
    public static final int size = 9;
    public static int[][] arr;
    
    public static List<int[]> list;
    public static boolean isEnd;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = null;   // �ΰ����� ����
        
        arr = new int[size][size];
        list = new ArrayList<>();
        
        for(int i=0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                
                if(arr[i][j] == 0) list.add(new int[] {i, j});
            }
        }
        // �Է� �Ϸ� 
        backtracking(0, 0);
        
    }
    public static void backtracking(int idx, int cnt) {
        // ����� ���Դٸ� ��ȸ�� �ʿ䰡 ����.
        if(isEnd) return;
        
        //��ĭ�� �Էµ� cnt�� �ʱ� zero ���� cnt�� ���ٸ� ���� �Է��� �Ȱ�.
        if(cnt == list.size()) {
            isEnd = true;
            print();
            return;
        }
        // �ε����� listũ�⸦ �Ѿ�� ��
        if(idx >= list.size()) return;
        
        int y = list.get(idx)[0];
        int x = list.get(idx)[1];
        
        // 1 ���� 9 ���� �Է� ������ ���� �� Ȯ���Ѵ�.
        for(int i=1; i<=9; i++) {
            // �ش� ���ڰ� �����ϸ� �ش� ��ǥ�� ���� �Է��ϰ� backtracking�� �Ѵ�. 
            if(isAble(y, x, i)) {
                arr[y][x] = i;
                backtracking(idx+1, cnt+1);
                arr[y][x] = 0;
            }
        }
        
    }
    
    public static void print() {
        // ��� ���
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
            // ���ΰ� ��ȿ���� arr[y][x]�� ���� ���ο� �� �����ϸ� �ȵȴ�.
            if(arr[y][i] == v) return false;
            
            // ���ΰ� ��ȿ���� arr[y][x]�� ���� ���ο� �� �����ϸ� �ȵȴ�.
            if(arr[i][x] == v) return false;
        }
        
        // 3*3�� ��ȿ����
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



