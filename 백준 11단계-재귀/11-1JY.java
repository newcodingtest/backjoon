package fact;
import java.util.Scanner;

public class 11-1+JY+fact1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
	
		int i;
		int fac=1;
		
		System.out.println("�Է��Ͻÿ�");
		
        i=scan.nextInt();
		
        for(int k=1; k<=i; k++) {
        	fac*=k;
        }
        
        if(i<13) 
        {System.out.println(fac);
        }
        else {
        	System.out.println("������ ������ϴ�");
        }
        }
	
	
        
		
		
	}


