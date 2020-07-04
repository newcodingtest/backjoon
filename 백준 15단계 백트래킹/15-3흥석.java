////280064KB	648ms
import java.io.*;

public class NM3 {
    static int list[];
    static int n;
    static int m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void dfs(int cnt) throws IOException {

        if(cnt == m) {
            for(int i=0;i<m;i++) {
                bw.write(String.valueOf(list[i]+" "));
            }
            bw.newLine();
            return;
        }

        for(int i =1;i<=n;i++) {
            list[cnt]=i;
            dfs(cnt+1);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        list = new int [9];
        dfs(0);

        bw.flush();
        bw.close();
    }
}