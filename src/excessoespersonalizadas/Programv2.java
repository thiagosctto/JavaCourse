package excessoespersonalizadas;

import java.util.Scanner;

import exceptions.DepositException;
import exceptions.WithdrawException;

public class Programv2 {
	public static void main(String[] args) throws WithdrawException, DepositException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		acc.withdraw(250.5);
		acc.deposit(-45.4);
		
		
		sc.close();
	}
}
