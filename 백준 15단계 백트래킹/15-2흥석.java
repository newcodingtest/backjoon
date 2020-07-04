import java.io.*;

public class Main {
    static int list[];
    static int n;
    static int m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void dfs(int cnt,int idx) throws IOException {

        if(cnt == m) {
            for(int i=0;i<m;i++) {
                bw.write(String.valueOf(list[i]+" "));
            }
            bw.newLine();
            return;
        }

        for(int i =idx+1;i<=n;i++) {
            list[cnt]=i;
            dfs(cnt+1,i-1);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        list = new int [9];
        dfs(0,0);

        bw.flush();
        bw.close();
    }
}