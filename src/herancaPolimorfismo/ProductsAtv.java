package herancaPolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductsAtv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> pds = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char op = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(op == 'c') {
				pds.add(new Product(name,price));
			}else if (op == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				pds.add(new UsedProduct(name, price, date));
			}else {
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				pds.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product pd : pds) {
			System.out.println(pd.priceTag());
		}
		sc.close();
	}
}
