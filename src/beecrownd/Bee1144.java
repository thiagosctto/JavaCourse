package beecrownd;

import java.util.Scanner;

public class Bee1144 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i+" "+(int)Math.pow(i, 2)+" "+(int)Math.pow(i, 3));
			System.out.println(i+" "+(int)(Math.pow(i, 2)+1)+" "+(int)(Math.pow(i, 3)+1));
		}
		sc.close();
	}
}
