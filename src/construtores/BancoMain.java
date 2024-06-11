package construtores;
import java.util.Scanner;

public class BancoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco conta;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();	
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		System.out.print("Is there na initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta = new Banco(account, holder, deposit);
		}else {
			conta = new Banco(account, holder);
		}
		System.out.println("Account data: ");
		System.out.println(conta.toString());
		
		System.out.print("Enter a deposit value: ");
		conta.Deposito(sc.nextDouble());
		System.out.println(conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		conta.Saque(sc.nextDouble());
		System.out.println(conta.toString());
		
		sc.close();
	}
}
