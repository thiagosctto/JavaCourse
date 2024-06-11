package membrosEstaticos;
import java.util.Scanner;

public class Activitie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought: ");
		double bought = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("Amount to be paid in reais = %.2f%n",CurrencyConverter.Converter(dollar, bought));
	}
}
