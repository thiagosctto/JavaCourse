package enumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Product2;
import entities.enums.OrderStatus;

public class OrderAplication {
	public static void main(String[] args) throws ParseException {
		
		//Instanciando suportes
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		//Instanciando classes
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name,email,birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i =0; i<n;i++) {
			System.out.println("Enter #"+(i+1)+" item data: ");
			System.out.print("Product name: ");
			sc.next();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity");
			int quantity = sc.nextInt();
			
			Product2 prod1 = new Product2(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity,productPrice, prod1);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		sc.close();
		}
}	