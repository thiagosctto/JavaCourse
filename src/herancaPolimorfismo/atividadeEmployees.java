package herancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class atividadeEmployees {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int qtd = sc.nextInt();	
		
		for(int i = 1; i <= qtd; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.printf("Outsourced (y/n): ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
			}else {
				list.add(new Employee(name,hours,valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - R$" + emp.payment());
		}
		
		sc.close();
	}
}
