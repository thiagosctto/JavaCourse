package otilia;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Cotação: ");
		float coat = sc.nextFloat();
		System.out.printf("Quantidade: ");
		float qtdDol = sc.nextFloat();
		
		Conversor conv = new Conversor(qtdDol,coat);
		System.out.printf("Total a pagar: R$"+conv.Converter());
	}
}
