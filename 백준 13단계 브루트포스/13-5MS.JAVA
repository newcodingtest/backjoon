import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int cnt = 1;
        int result = 666;
        while(cnt != num) {
        	result++;
        	if(String.valueOf(result).contains("666")){
        		cnt++;
        	}
        }
        System.out.println(result);
    }
}