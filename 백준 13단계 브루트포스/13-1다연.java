//첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.
//합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
//첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다
package week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class DY13_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		long start = System.currentTimeMillis();
		blackjack(st, n, m);
		long end = System.currentTimeMillis();
		double sbTime = (end-start) / 1000.0;
		System.out.println("sbTime : " + sbTime);
	}

	public static void blackjack(StringTokenizer st, int n, int m) {
		int i, sum, tmp=0;
		int[] array = new int[n];
		StringBuilder sb = new StringBuilder();
		for(i=0;i<n;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		for(i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k = j+1; k<n;k++) {
					sum = array[i]+array[j]+array[k];
					if(sum<m) {
						if(sum>tmp) {
							tmp=sum;
						}
					}else if(sum==m) {
						sb.append(m);
						System.out.println(sb);
						return;
					}
				}
			}
		}
		sb.append(tmp);
		System.out.println(sb);
	}

}
