package back;
import java.io.*; 
import java.util.*;
import java.io.IOException;



public class sort4 {  // 메모리 54752KB 시간 760ms
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		String [][] arr=new String[N][2];
		
	
		for(int i=0; i<N; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			arr[i][0]=st.nextToken();
			arr[i][1]=st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			
			//Arrays.sort() 내부에 Comparator를 구현할 수 있도록 정의되어 있다
			public int compare(String[] x1, String[] x2) { // compare은 기본적으로 오름차순으로 정렬됨
				return Integer.compare(Integer.parseInt(x1[0]), Integer.parseInt(x2[0])); // x값을 기준으로 오름차순 진행
			}
		});
		
		for(int i=0; i<N; i++) {
		    bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		  
		}
		  
		    bw.flush();
		    bw.close();
            
	}      

} 



/* public class sort4{

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// 1)
	int N = scan.nextInt();
	String[][] sArr = new String[N][2];	
	
	for(int i=0; i<N; i++) {
		sArr[i][0] = scan.next();	// 나이
		sArr[i][1] = scan.next();	// 이름
	}
	
	// 2)
	Arrays.sort(sArr, new Comparator<String[]>() {

		@Override
		public int compare(String[] a, String[] b) {
			return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
		}
	});
	
	for(int i=0; i<N; i++)
		System.out.println(sArr[i][0] + " " + sArr[i][1]);
	
	scan.close();
}

}
*/