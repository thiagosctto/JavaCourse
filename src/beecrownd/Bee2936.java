package beecrownd;

import java.util.Scanner;

public class Bee2936 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int b = sc.nextInt();
		int bb = sc.nextInt();
		int m = sc.nextInt();
		int i = sc.nextInt();
		
		int total = (c*300) + (b * 1500) + (bb * 600) + (m * 1000) + (i * 150) + 225;
		System.out.println(total);
		
		sc.close();
	}
}
