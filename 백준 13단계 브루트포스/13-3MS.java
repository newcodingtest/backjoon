import java.util.Scanner;

class People{
	int kg;
	int height;
	int rank = 1;
	public People(int kg, int height) {
		this.kg = kg;
		this.height = height;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		People[] p = new People[n];
		for(int i=0; i<p.length; i++) {
			p[i] = new People(s.nextInt(),s.nextInt());
		}
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p.length; j++) {
				if(p[i].kg < p[j].kg && p[i].height < p[j].height ) {
					p[i].rank += 1;
				}
			}
		}
		
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i].rank + " ");
		}
	}
}