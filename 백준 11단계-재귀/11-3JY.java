package fact;

import java.io.BufferedReader;
import java.io.IOException; // try catch 또는 throws에 사용
import java.io.InputStreamReader;
import java.util.Arrays;

public class 11-3JY{
	
	static char arr[][];   //2차원의 배열을 생성
	
	public static void test(int x, int y, int num) { //재귀호출 반복할 메서드
		int div=0;
		
		if(num==1) {           //재귀호출 끝나는 부분
			arr[x][y]='*';
			return;
		}
		
		div=num/3;
		
		for(int i=0; i<3; i++) {     //3x3의 별을 만든다
			for(int j=0; j<3; j++) {
				if(i==1 && j==1) continue;          //조건문에 해당시 반복부분만 탈출하고 다음번 반복을 진행
				test(x+(div*i),y+(div*j),div);  //시작점을 옮겨준다 ex) 27이 입력되면 (0.0) 에서 (0.9)로 이동됨
			}
		}
		
		
	}
	
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    int n=Integer.parseInt(br.readLine());
	    
	    arr=new char[n][n];
	    
	    for(int i=0; i<arr.length; i++) {
	    	Arrays.fill(arr[i], ' ');      //위 조건문에 해당하는 부분은 공백으로채움
	    }
	    
	    test(0,0,n);
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);    //총 구성된 배열문을 출력해준다
	    }
	}
	
	}
	

	
	
		
