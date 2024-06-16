package beecrownd;

import java.util.Scanner;

public class Bee3048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		int[] vect = new int[n];
		
		for (int i=0;i<vect.length;i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int j=0;j<=vect.length;j++) {
				if (vect[j] != vect[j+1] && vect[j] != vect[j+2]) {
					cont++;
				}
		}
		
		System.out.println(cont);
		sc.close();
	}
}
