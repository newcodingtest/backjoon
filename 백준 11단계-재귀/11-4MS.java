package test;
import java.util.Scanner;

class Hanoi {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    static void Hanoi(int n, int from, int by, int to) {
        count++;
        // n == 1이면 A에서 C로 이동
        if(n == 1) sb.append(from + " " + to + "ccc\n");
        else {
            // n번째 원반을 옮기기 위해 n-1개를 A에서 B로 이동..
            Hanoi(n-1, from, to, by);
            // n번째의 원반을 C로 이동
            sb.append(from + " " + to + "ddd\n");
            // 다시 B로 이동한 n-1개의 원반을 이제 C로 이동시킨다.
            Hanoi(n-1, by, from, to);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        Hanoi(n, 1, 2, 3);
        sb.insert(0, count + "답\n");

        System.out.println(sb);

        sc.close();
    }
}