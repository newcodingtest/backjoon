package back;
import java.io.*; 
import java.util.*;
import java.io.IOException;



public class sort4 {  // �޸� 54752KB �ð� 760ms
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
			
			//Arrays.sort() ���ο� Comparator�� ������ �� �ֵ��� ���ǵǾ� �ִ�
			public int compare(String[] x1, String[] x2) { // compare�� �⺻������ ������������ ���ĵ�
				return Integer.compare(Integer.parseInt(x1[0]), Integer.parseInt(x2[0])); // x���� �������� �������� ����
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
		sArr[i][0] = scan.next();	// ����
		sArr[i][1] = scan.next();	// �̸�
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