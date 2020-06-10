package week4;

import java.io.*;

public class DY14_2 {
	public static int middle(int n, int array[]) {
		if(n!=1) {
			return n/2;
		}else {
			return 0;
		}
	}
	
	public static int often(int n, int array[]) {
		int cnt[] = new int[8001];
		int max = 0;
		boolean sw = false;
		for(int i=0;i<n;i++) {
			cnt[array[i]+4000]++;
		}
		int idx=0;
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]==max) sw=true;
			if(cnt[i]>max&&cnt[i]>0) {
				max=cnt[i];
				idx=i;
				sw=false;
			}
		}
		if(sw) {
			cnt[idx] = 0;
			// 이후 다시 최빈값 찾는 프로세스 진행
			// 해당 프로세스에서 결과로 나온 가장 작은 최빈값이 결국 두번째로 작은 최빈값임
			max = 0;
			idx = 0;
			for(int i = 0; i <= 8000; i++) {
				if(cnt[i] > max) {
					max = cnt[i];
					idx = i;
				}
			}	
		}
		return idx-4000;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

		int n = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		int tmp, mid, gap, sum=0, often;
		for(int i=0;i<n;i++) {
			array[i] = Integer.parseInt(br.readLine());
			sum+=array[i];
				for(int j=0;j<=i;j++) {
					if(array[i]<array[j]) {
						tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
		}
		int avg = Math.round((float)sum/n);
		bw.write(avg+"\n");
		mid = middle(n, array);
		bw.write(array[mid]+"\n");
		often = often(n, array);
		bw.write(often+"\n");
		gap = array[n-1]-array[0];
		bw.write(gap+"\n");
		bw.close();
	}

}
