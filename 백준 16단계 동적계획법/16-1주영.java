package back;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 ����: �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.

          �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�. n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.

      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 
      n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�:  ù° �ٿ� n�� �־�����. n�� 90���� �۰ų� ���� �ڿ����̴�.

���:  ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�. 10>> 55         ����Լ� ���� �ð��ʰ�����
 */

public class fab1{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();


        bw.write(String.valueOf(fibonacchi(n)));
        bw.close();
    }

    public static long fibonacchi(int n) {
        long nums[] = new long[n+1];                 //45���� 90���� ���������Ƿ� int ���� long ���� �ٲ�

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
 ������ȹ�� DP�� �̿��Ͽ� Ǯ��
 
 ū������ ���� ������ ������ Ǫ�� �˰���
 
 Top-Down
ū ������ ���� ������ ������.
F(n-1), F(n-2)�� ������.
Top-Down�� ����Լ��� ���ؼ� �����Ǳ� ������ �Լ� ȣ�⿡ ���� ������尡 �߻��Ѵٴ� ������ ������,
Memoization�� �� Ȱ���ϸ� Bottom-Up���� �̾���� �����ϴ�.

���� ������ Ǭ��.
F(n-1) + F(n-2)

Bottom-Up
������ ũ�Ⱑ ���� �������� ���ʴ�� ����.
������ ũ�⸦ ���ݾ� ũ�� ����鼭 ������ Ǭ��.
���� ������ Ǯ�鼭 ū ������ ���� ���Ѵ�.

Bottom-Up�� ū ������ �ذ��ϱ� ���ؼ� � Sub Problem�� �䱸�Ǵ��� ���� ��� �κ� ������ �ذ��ؾ� �Ѵٴ� ������ ������,
for������ �����ǹǷ� �ڿ��� ���� �����ο��� �ð� �� �޸��� ����ȭ�� ������!
 
 https://do-rang.tistory.com/9 ����
 */