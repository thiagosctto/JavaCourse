package beecrownd;

import java.util.Scanner;

public class Bee3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = ((N+1)*(N+2))/2; 
		System.out.println(m);
		sc.close();
	}
}
