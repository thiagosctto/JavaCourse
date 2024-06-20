package beecrownd;

import java.util.Scanner;

public class Bee2172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		do {
			System.out.println(m * n);
			n = sc.nextInt();
			m = sc.nextInt();
		}while (m != 0 && n != 0);
		
		sc.close();
	}
}
