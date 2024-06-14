package atividade;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double sum = 0;
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}else if (salario<=3000) {
			salario = salario % 2000;
			sum = salario * 0.08;
		}else if (salario<=3000) {
			salario = salario % 2000;
			sum = salario * 0.08;
		}
		
		sc.close();
	}
}
