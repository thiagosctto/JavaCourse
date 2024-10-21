package tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {	
	public static void main(String[] args) {
		
		method2();
		
		System.out.println("end of program");

	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Method2 start***");
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		}catch(InputMismatchException e) {
			System.out.println("Input error");
		}
				
		sc.close();
		System.out.println("***Method2 end***");
	}
}