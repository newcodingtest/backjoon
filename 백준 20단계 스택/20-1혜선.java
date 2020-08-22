import java.util.Scanner;
import java.util.Stack; 
public class 스택_내풀이 { 
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in); 
    int N=sc.nextInt(); sc.nextLine(); 
    Stack<Integer> stack= new Stack<>();
    
    for(int i=0; i<N; i++)
    {
        String command=sc.nextLine(); 
        if(command.contains(" ")) { 
        int num=Integer.parseInt(command.split(" ")[1]); 
        stack.push(num);	 
    } 
      if(command.equals("pop")) 
         System.out.println(stack.pop()); 
      if(command.equals("size")) 
         System.out.println(stack.size()); 
      if(command.equals("empty"))  
         System.out.println(stack.empty());     
      if(command.equals("top")) 
         System.out.println(stack.top()); 
    } 
  } 
