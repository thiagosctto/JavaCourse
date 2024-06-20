package beecrownd;

import java.util.Scanner;

public class Bee1985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double som = 0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int p = sc.nextInt();
			int qtd = sc.nextInt();
			switch(p) {
			case 1001:
				som+= (1.5 * qtd);
				break;
			case 1002:
				som+= (2.5 * qtd);
				break;
			case 1003:
				som+= (3.5 * qtd);
				break;
			case 1004:
				som+= (4.5 * qtd);
				break;
			case 1005:
				som+= (5.5 * qtd);
				break;
			}
		}
		System.out.printf("%.2f%n",som);
		sc.close();
	}
}
