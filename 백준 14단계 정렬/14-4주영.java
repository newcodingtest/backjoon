package back;
import java.io.*;
import java.util.Arrays;

public class sort4 { //�̿ϼ� �����ʿ�!!
	public static void main(String[] arsg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());  //n���� ���� �־�������
		double[] arr = new double[N];  
		double sum=0;             //-�� ǥ���� ����
		
		
		for(int i=0; i<N; i++) {arr[i]=Integer.parseInt(br.readLine());}
		for(double i:arr) {sum+=i;}
		
		bw.write("��������"+Math.round((double)sum/(int)N)+"\n"); //math.round �Ҽ��� �ݿø� �Լ�
		Arrays.sort(arr);
		bw.write("�߾Ӱ���"+(double)arr[N/2]+"\n");
		
	
		
		//�ֺ����, ������ ������ �ֺ��� �ι�°�� ���������
		//��������� 
		bw.flush();
		bw.close();
			}
		
	}


