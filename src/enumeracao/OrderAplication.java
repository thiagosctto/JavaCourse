package enumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;

public class OrderAplication {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String dataBirt = sc.nextLine();
		sdf.parse(dataBirt);
		
		Client cliente = new Client(name,email,dataBirt);	
	}
}	