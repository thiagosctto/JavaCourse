package beecrownd;

import java.util.Scanner;

public class Bee2061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i=0;i<m;i++) {	
			String op = sc.nextLine();
			n = (op.equals("fechou")?--n:++n);
		}
		System.out.println(n);
		sc.close();
	}
}
