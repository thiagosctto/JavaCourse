package construtores;

import java.util.Scanner;
import entities.Product;

public class Program {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product produto = new Product(name,price,quantity);

			
			System.out.println();
			System.out.println(produto.toString());
			
			System.out.println("Enter the number of products to be added in stock: ");
			quantity = sc.nextInt();
			produto.addProducts(quantity);
			
			System.out.println();
			System.out.println(produto.toString());
			
			System.out.println("Enter the number of products to be removed from stock: ");
			int rmv = sc.nextInt();
			produto.removeProducts(rmv);
			
			System.out.println();
			System.out.println(produto.toString());
			
			sc.close();

		}
}
