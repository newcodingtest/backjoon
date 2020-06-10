package back;
import java.io.*;
import java.util.Arrays;

public class sort4 { //미완성 수정필요!!
	public static void main(String[] arsg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());  //n개의 수가 주어졌을때
		double[] arr = new double[N];  
		double sum=0;             //-값 표현을 위해
		
		
		for(int i=0; i<N; i++) {arr[i]=Integer.parseInt(br.readLine());}
		for(double i:arr) {sum+=i;}
		
		bw.write("산술평균은"+Math.round((double)sum/(int)N)+"\n"); //math.round 소수점 반올림 함수
		Arrays.sort(arr);
		bw.write("중앙값은"+(double)arr[N/2]+"\n");
		
	
		
		//최빈값출력, 여러개 있을땐 최빈값중 두번째로 작은값출력
		//범위값출력 
		bw.flush();
		bw.close();
			}
		
	}


