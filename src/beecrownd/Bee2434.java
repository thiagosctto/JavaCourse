package beecrownd;

import java.util.Scanner;

public class Bee2434 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int menor = m;
		
		for(int i=0;i<n;i++) {
			int valor = sc.nextInt();
			m += valor;
		}
		if (m < menor) {
			menor = m;
		}
		
		System.out.println(menor);
		sc.close();
	}
}
