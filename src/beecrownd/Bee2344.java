package beecrownd;

import java.util.Scanner;

public class Bee2344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char nota = 0;
		if (n == 0) {
			nota = 'E';
		}else if (n <= 35) {
			nota = 'D';
		}else if (n <= 60) {
			nota = 'C';
		}else if (n <= 85) {
			nota = 'B';
		}else if (n <= 100) {
			nota = 'A';
		}
			
		System.out.println(nota);
		sc.close();
	}
}
