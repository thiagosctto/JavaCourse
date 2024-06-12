package atividade;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if (salario <= 400.00) {
			float reajuste = (float) (salario*1.15);
			System.out.printf("Novo salario: %.2f%n",reajuste);
			double aumento = salario*0.15;
			System.out.printf("Reajuste ganho: %.2f%n",aumento);
			System.out.println("Em percentual: 15 %");
		}else if (salario <= 800.00) {
			float reajuste = (float) (salario*1.12);
			System.out.printf("Novo salario: %.2f%n",reajuste);
			double aumento = salario*0.12;
			System.out.printf("Reajuste ganho: %.2f%n",aumento);
			System.out.println("Em percentual: 12 %");
		}else if (salario <= 1200.00) {
			float reajuste = (float) (salario*1.10);
			System.out.printf("Novo salario: %.2f%n",reajuste);
			double aumento = salario*0.1;
			System.out.printf("Reajuste ganho: %.2f%n",aumento);
			System.out.println("Em percentual: 10 %");
		}else if (salario <= 2000.00) {
			float reajuste = (float) (salario*1.07);
			System.out.printf("Novo salario: %.2f%n",reajuste);
			double aumento = salario*0.07;
			System.out.printf("Reajuste ganho: %.2f%n",aumento);
			System.out.println("Em percentual: 7 %");
		}else if (salario > 2000.00) {
			float reajuste = (float) (salario*1.04);
			System.out.printf("Novo salario: %.2f%n",reajuste);
			double aumento = salario*0.04;
			System.out.printf("Reajuste ganho: %.2f%n",aumento);
			System.out.println("Em percentual: 4 %");
		}
		sc.close();
	}
}
