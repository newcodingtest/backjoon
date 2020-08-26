package back;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
 
/* 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.

입력의 종료조건으로 맨 마지막에 점 하나(".")가 들어온다.
*/


public class Main { //메모리:18068 메모리:248
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack=new Stack<Character>();
        
        while(true) {
        	String str=br.readLine();
        	if(str.contentEquals("."))
        			return;
        	
        boolean vps=true;
        
        for(int i=0; i<str.length(); i++) { //한글자씩 1:1검사
        	char c=str.charAt(i);
        	
        	switch(c) {
        	case '(':
        	case '[':
        	    stack.push(c);
        	    break;
        	case ')':
        	if(stack.isEmpty() || stack.pop()!='(') { //비어있거나ㅣ 대칭이 없다면
        		vps=false;
        	}
        	break;
        	case ']':
        	if(stack.isEmpty() || stack.pop()!='[') {// 비어있거나 대칭이 없다면
        		vps=false;
        	}
        	break;
        	}
        }
        
        if(!stack.isEmpty()) { //비어있지 않다면
        	vps=false;
        }
        if(vps==true) {
        	System.out.println("yes");
        }
        else
        	System.out.println("no");
        stack.clear();
        
        }
        }
        
  
}