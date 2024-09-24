package abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.printf("Tax payer %d data: %n",i);
			System.out.print("Individual or company (i/c)?");
			char c = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			
			if(c == 'i') {
				System.out.print("Value of health care: ");
				Double healthSpending = sc.nextDouble();
				list.add(new PhysicsPerson(name,annualIncome,healthSpending));
				
			}else {
				System.out.print("How much employees do you have: ");
				int numberEmployees = sc.nextInt();
				list.add(new JuridicPerson(name, annualIncome, numberEmployees));
			}

			}
			
		System.out.println();
		System.out.println("TAXES PAID: ");
		Double total = (double) 0;
		for(Person ps : list) {
			System.out.println(ps.getName()+": $ "+ps.incomme());
			total += ps.incomme();
		}
		System.out.printf("TOTAL TAXES: $ %.2f",total);
		sc.close();
}}
