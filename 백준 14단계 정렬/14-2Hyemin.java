import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Wrong Answer
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -3999;
        int min = 4001;
        int sum = 0;
        int feqCnt = 0;
        int feqNum01 = 0;
        int feqNum02 = 0;
        int cenCnt = 0;
        int cenNum = 0;

        int[] numbers = new int[8001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[num + 4000]++;
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        for (int i = 1; i <= 8000; i++) {
            if (numbers[i] > 0) {
                int cenCntBefore = cenCnt;
                cenCnt += numbers[i];
                int cenCntAfter = cenCnt;
                if (cenCntBefore < (n / 2) + 1 && cenCntAfter >= (n / 2) + 1) {
                    cenNum = (i - 4000);
                };

                if (numbers[i] == feqCnt) {
                    int feqNumTemp = (i - 4000);
                    if (feqNumTemp < feqNum01) {
                        feqNum02 = feqNum01;
                        feqNum01 = feqNumTemp;
                    } else if (feqNum01 == feqNum02 || (feqNumTemp > feqNum01 && feqNumTemp < feqNum02)) {
                        feqNum02 = feqNumTemp;
                    }
                } else if (numbers[i] > feqCnt) {
                    feqCnt = numbers[i];
                    feqNum01 = (i - 4000);
                    feqNum02 = (i - 4000);
                }
            }
        }

        bf.write(Math.round((double)sum / (double)n) + "\n");
        bf.write(cenNum + "\n");
        bf.write(feqNum02 + "\n");
        bf.write((max - min) + "\n");

        bf.flush();
        bf.close();
    }
}
