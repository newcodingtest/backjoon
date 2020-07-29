import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int arr[];
	static int dp[];
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
			int num = Integer.parseInt(br.readLine());
			arr = new int[num];
			dp = new int[num];
			for(int i=0; i<num; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			sol(arr,dp,num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void sol(int arr[], int dp[], int n) {
		if(n >= 1) {
			dp[0] = arr[0];
		}
		if(n >= 2) {
			dp[1] = arr[0] + arr[1];
		}
		if(n >= 3){
			dp[2] = Math.max(dp[1], Math.max(dp[0] + arr[2], arr[1] + arr[2])); 
		}
		for(int i=3; i<n; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
		}
		System.out.println(dp[n - 1]);
	}
}

