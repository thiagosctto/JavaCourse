package beecrownd;

import java.util.Scanner;

public class Bee1589 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			System.out.println(r1+r2);
		}
		sc.close();
	}
}
