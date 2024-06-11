package testes;

import entities.Triangle;


public class Teste01 {
	public static void main(String[] args) {
		
		Triangle x ,y;
		x = new Triangle(1.00,2.00,3.00);
		y = new Triangle(3.55,4.6,5.02);
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println(areaX);
		System.out.println(areaY);
	}
}
