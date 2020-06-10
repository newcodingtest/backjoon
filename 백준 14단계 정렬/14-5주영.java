package back;
import java.io.*;
import java.io.IOException;
import java.util.*;


public class sort5 {   //내림차순 정렬
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
        char[] arr=br.readLine().toCharArray(); //.toCharArray()=문자배열을 돌려줌
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--) {bw.write(arr[i]);} //배열상 0 1 2 3 에서 -1을 하면 3에서부터 시작한다
        
        bw.flush();
        
		
		
	}

}
