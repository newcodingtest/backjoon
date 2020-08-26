package back;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
 
/* ��� ���� �Ұ�ȣ("(")�� ������ �Ұ�ȣ(")")�͸� ¦�� �̷�� �Ѵ�.
��� ���� ���ȣ("[")�� ������ ���ȣ("]")�͸� ¦�� �̷�� �Ѵ�.
��� ������ ��ȣ���� �ڽŰ� ¦�� �̷� �� �ִ� ���� ��ȣ�� �����Ѵ�.
��� ��ȣ���� ¦�� 1:1 ��Ī�� �����ϴ�. ��, ��ȣ �ϳ��� �� �̻��� ��ȣ�� ¦�������� �ʴ´�.
¦�� �̷�� �� ��ȣ�� ���� ��, �� ���̿� �ִ� ���ڿ��� ������ ������ �Ѵ�.

�Է��� ������������ �� �������� �� �ϳ�(".")�� ���´�.
*/


public class Main { //�޸�:18068 �޸�:248
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack=new Stack<Character>();
        
        while(true) {
        	String str=br.readLine();
        	if(str.contentEquals("."))
        			return;
        	
        boolean vps=true;
        
        for(int i=0; i<str.length(); i++) { //�ѱ��ھ� 1:1�˻�
        	char c=str.charAt(i);
        	
        	switch(c) {
        	case '(':
        	case '[':
        	    stack.push(c);
        	    break;
        	case ')':
        	if(stack.isEmpty() || stack.pop()!='(') { //����ְų��� ��Ī�� ���ٸ�
        		vps=false;
        	}
        	break;
        	case ']':
        	if(stack.isEmpty() || stack.pop()!='[') {// ����ְų� ��Ī�� ���ٸ�
        		vps=false;
        	}
        	break;
        	}
        }
        
        if(!stack.isEmpty()) { //������� �ʴٸ�
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