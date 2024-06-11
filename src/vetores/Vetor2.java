package vetores;

import java.util.Scanner;

public class Vetor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Product[] vect = new Product[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextInt();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		};
		
		System.out.println(vect[0]);

		sc.close();
	}
}
