package beecrownd;

import java.util.Scanner;

public class Bee2339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int p = sc.nextInt();
		int f = sc.nextInt();
		System.out.println((c*f>p)?"S":"F");		
		sc.close();
	}
}
