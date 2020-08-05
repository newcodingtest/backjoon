package back;

import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

class Edge implements Comparable<Edge>{ // �� ������ ����� ���� �� Ŭ����
	int node[] = new int[2];
	int distance;
	
	public Edge(int a,int b, int distance) {
		this.node[0]=a;
		this.node[1] = b;
		this.distance = distance;
	}

	@Override
	public int compareTo(Edge o) { // �� ��ü���� ����� �������� �����ϱ� ���� Override
		if(this.distance < o.distance) return -1;
		else if(this.distance> o.distance) return 1;
		return 0;
	}
	
	}
    // �⺻���� Union - Find �˰��� ���Ǵ� �޼ҵ���� �״�� ����Ѵ�.
	public class dp12{
		
		public static int getParent(int[] arr,int x) {
			if(arr[x] == x) return x; // �ڱ� �ڽ��� �θ��� ���
			return arr[x] = getParent(arr,arr[x]);
		}
		
		public static void unionParent(int[] arr,int a,int b) {
			a = getParent(arr,a);
			b = getParent(arr,b);
			
			if(a<b) arr[b] = a;
			else arr[a] = b;	
		}
		
		public static int findParent(int[] arr,int a, int b) {
			a = getParent(arr,a);
			b = getParent(arr,b);
			
			if(a==b) return 1;
			else return 0;
		}
		public static void main(String[] args) {
			int v=7; // ������ ��
			int e=11; // ������ �� 
			
			ArrayList<Edge> arr = new ArrayList<>(); // ��ü�� ArrayList�� �̿��Ͽ� ����
			arr.add(new Edge(1,7,12));
			arr.add(new Edge(1,4,28));
			arr.add(new Edge(1,2,67));
			arr.add(new Edge(1,5,17));
			arr.add(new Edge(2,4,24));
			arr.add(new Edge(2,5,62));
			arr.add(new Edge(3,5,20));
			arr.add(new Edge(3,6,37));
			arr.add(new Edge(4,7,13));
			arr.add(new Edge(5,6,45));
			arr.add(new Edge(5,7,73));
			arr.add(new Edge(1,7,12));
			
			Collections.sort(arr); // ������ Override�� �������� ArrayList ���� ����
			
			int parent[] = new int[v]; // Uinon - Find �˰��򿡼� ��� �� �θ� ���� ���� �迭
			int sum =0; // �� �Ҹ� ���
			for(int i=0;i<parent.length;i++) { // ���� ���� ����
				parent[i] = i;
			}
            
			for(int i=0;i<arr.size();i++) {
                //��ü�� ����Ǿ��ִ� �� �������� ����Ŭ�� �ִ��� Ȯ��
                //-1�� ���ִ� ������ ���޵Ǵ� parent �迭�� 7�� ũ�⸦ �����Ƿ�, 
                // 1�� �з��� �ε����� ��� ex) 1�� ������ 0�� �ε���
                // ����Ŭ�� �߻����� �ʴ´ٸ�,
				if(findParent(parent,arr.get(i).node[0]-1,arr.get(i).node[1]-1)==0) {
					sum+=arr.get(i).distance; // �� �Ҹ���
					unionParent(parent,arr.get(i).node[0]-1,arr.get(i).node[1]-1);
                    // �� ������ ����
				}
			}
			System.out.println(sum);
		}
	
	}