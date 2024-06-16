package beecrownd;

import java.util.Scanner;

public class Bee2388 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			sum += n1 * n2;
		}
		System.out.println(sum);
		sc.close();
	}
}
