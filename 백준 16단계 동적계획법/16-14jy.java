package back;
import java.io.*;

/*
  ACAYKP
  CAPCAK
  두수열에서 공통적으로 갖고있는 가장 긴 부분 수열의 길이를 구하라
  
  - AAK
  - CAK
  - ACAK
  https://www.youtube.com/watch?v=P-mMvhfJhu8&feature=emb_title
  https://jaesungbong.tistory.com/21
    0 A C A Y K P
  0 0 0 0 0 0 0 0  
  C 0 0 1 1 1 1 1
  A 0 1 1 2 2 2 2
  P 0 1 1 2 2 2 3
  C 0 1 2 2 2 2 3
  A 0 1 2 3 3 3 3
  K 0 1 2 3 3 4 4
  
  
  
 * */

public class dp14 { //메모리:17420   //시간:120
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	String a=br.readLine();
	String b=br.readLine();
	
	int [][]arr=new int[a.length()+1][b.length()+1];
	
	for(int i=1; i<=a.length(); i++) {
		for(int j=1; j<=b.length(); j++) {
			if(a.charAt(i-1)!=b.charAt(j-1)) { arr[i][j]=Math.max(arr[i][j-1], arr[i-1][j]); //문자가 같지 않을 경우에는 해당 위치에서 직전 행과 이전 열의 값(왼쪽 값과 위의 값)중 최대값을 기입한다.  
			} else {arr[i][j]=arr[i-1][j-1]+1;//, 같은 문자일 경우에는 값을 + 해준다
			}
		}
	}
	
	System.out.println(arr[a.length()][b.length()]);
	
	}
}

