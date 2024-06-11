package testes;

import java.util.Scanner;

import entities.Product;

public class Teste02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		Product produto = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
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
