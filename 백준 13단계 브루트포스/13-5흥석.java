import java.io.*;
import java.util.ArrayList;

public class PRACTICE {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());


        ArrayList arr = new ArrayList(10000);


        int i = 0;
        while (true) {
            String num = String.valueOf(i);
            if (num.contains("666")) {
                arr.add(num);
            }
            if (arr.size() == n) {
                break;
            }
            i++;
        }


        System.out.println(arr.get(n - 1));

    }
}

