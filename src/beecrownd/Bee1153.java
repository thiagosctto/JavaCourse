package beecrownd;

import java.util.Scanner;

public class Bee1153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = n;
		for (int i=1;i<n;i++) {
			r *= (n-i);
		}
		System.out.println(r);
		sc.close();
	}
}
