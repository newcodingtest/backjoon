//ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ´�.
//���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.
//ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�
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
