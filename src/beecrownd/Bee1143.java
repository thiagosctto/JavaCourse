package beecrownd;

import java.util.Scanner;

public class Bee1143 {
	public static void func(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+ " ");
			System.out.printf("%.0f ",Math.pow(i,2));
			System.out.printf("%.0f%n",Math.pow(i,3));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		func(n = sc.nextInt());
		
		sc.close();
	}
}
