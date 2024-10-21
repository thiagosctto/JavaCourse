package testes;

import java.io.IOException;
import java.util.Scanner;

public class tst {
	public static void main(String[] args) throws IOException {
		 
	       Scanner sc = new Scanner(System.in);
	       
	       int n = sc.nextInt();
	       
	       for(int i=0; i<n;i++) {
	    	   String op = sc.nextLine();
	    	   String op2 = sc.nextLine();
	    	   if(op == "tesoura" && op2 == "papel") {
	    		   System.out.println("Caso #1: Bazinga!");
	    	   }else if(op == "papel" && op2 == "pedra") {
	    		   System.out.println("Caso #1: Bazinga!");
	    	   }else if(op == "pedra" && op2 == "lagarto") {
	    		   System.out.println("Caso #1: Bazinga!");
	    	   }else if(op == "lagarto" && op2 == "Spock") {
	    		   System.out.println("Caso #1: Bazinga!");
	    	   }else if(op == "Spock" && op2 == "tesoura") {
	    		   System.out.println("Caso #1: Bazinga!");
	    	   }
	       }
	       	       
	       sc.close();
	    }
}
