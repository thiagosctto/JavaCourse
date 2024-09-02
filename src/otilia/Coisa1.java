package otilia;

import java.util.ArrayList;
import java.util.Scanner;

public class Coisa1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dias = sc.nextInt();
		ArrayList<Float> tempMax = new ArrayList<Float>();
		
		ArrayList<Float> tempMin = new ArrayList<Float>();
		
		for(int i=1;i <= dias;i++) {
			System.out.printf("Qual foi a maior temperatura no dia %d: ",i);
			tempMax.add((float) sc.nextDouble());
		}
		
		for(int i=1;i <= dias;i++) {
			System.out.printf("Qual foi a menor temperatura no dia %d: ",i);
			tempMin.add((float) sc.nextDouble());
		}
			
		Maior(tempMax,dias);
		Menor(tempMin,dias);
	}
	
	public static void Maior(ArrayList<Float> tempMax, int tam) {
		float maior = tempMax.get(0);
		
		for(int i = 0; i < tam; i++) {
			if (tempMax.get(i) > maior) {
				maior = tempMax.get(i);
			}
		}
		System.out.println(maior);
	}
	
	public static void Menor(ArrayList<Float> tempMin, int tam) {
		float menor = tempMin.get(0);
		
		for(int i = 0; i < tam; i++) {
			if (tempMin.get(i) < menor) {
				menor = tempMin.get(i);
			}
		}
		
		System.out.println(menor);
	}
}
