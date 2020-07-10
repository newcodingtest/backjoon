package back;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 문제: 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

          이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다. n=17일때 까지 피보나치 수를 써보면 다음과 같다.

      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 
      n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력:  첫째 줄에 n이 주어진다. n은 90보다 작거나 같은 자연수이다.

출력:  첫째 줄에 n번째 피보나치 수를 출력한다. 10>> 55         재귀함수 사용시 시간초과났음
 */

public class fab1{   // 메모리:13048 시간:76

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();


        bw.write(String.valueOf(fibonacchi(n)));
        bw.close();
    }

    public static long fibonacchi(int n) {
        long nums[] = new long[n+1];                 //45에서 90으로 증가했으므로 int 에서 long 으로 바꿈

        for (int i = 0; i <= n; i++) {
            nums[i] = (i < 2)? i : nums[i-1]+nums[i-2];
        }

        return nums[n];
    }
}

/* public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();


        bw.write(String.valueOf(fibonacchi(n)));
        bw.close();
    }

    public static int fibonacchi(int n) {
        int nums[] = new int[n+1];

        for (int i = 0; i <= n; i++) {
            nums[i] = (i < 2)? i : nums[i-1]+nums[i-2];
        }

        return nums[n];
    }
}
	
*/
	







/*
 동적계획법 DP를 이용하여 풀기
 
 큰문제를 작은 문제로 나눠서 푸는 알고리즘
 
 Top-Down
큰 문제를 작은 문제로 나눈다.
F(n-1), F(n-2)로 나눈다.
Top-Down은 재귀함수를 통해서 구현되기 때문에 함수 호출에 대한 오버헤드가 발생한다는 단점이 있지만,
Memoization을 잘 활용하면 Bottom-Up보다 훠어어얼씬 빠릅니다.

작은 문제를 푼다.
F(n-1) + F(n-2)

Bottom-Up
문제를 크기가 작은 문제부터 차례대로 쓴다.
문제의 크기를 조금씩 크게 만들면서 문제를 푼다.
작은 문제를 풀면서 큰 문제의 답을 구한다.

Bottom-Up은 큰 문제를 해결하기 위해서 어떤 Sub Problem이 요구되는지 몰라서 모든 부분 문제를 해결해야 한다는 단점이 있지만,
for문으로 구현되므로 자원에 비교적 자유로워서 시간 및 메모리의 최적화가 쉬워요!
 
 https://do-rang.tistory.com/9 참고
 */
