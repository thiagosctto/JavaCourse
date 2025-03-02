package testes;
import java.util.Scanner;
public class tst {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	    
		//Numeros de titas e tamanho das muralhas.
		String string = sc.nextLine();
		String[] numeros = string.split(" ");
		int titas = Integer.parseInt(numeros[0]);
		int tamMur =  Integer.parseInt(numeros[1]);
		
		//Tamnhos dos  titas
		String[] tamanhos = new String[titas];
		String tamanho = sc.nextLine();
		tamanhos = tamanho.split("");
		
		//valores de P M e G.
		String pmg = sc.nextLine();
		String[] pmgg = pmg.split(" ");
		   
		int p = Integer.parseInt(pmgg[0]);
		int m = Integer.parseInt(pmgg[1]);
		int g = Integer.parseInt(pmgg[2]);
	    
		//inicio
		
		int monstros = 0;
		
		for(int i=0; i<titas;i++) {
			if(tamanhos[i] == "P") {
				monstros += p;
			}else if(tamanhos[i] == "M") {
				monstros += m;
			}else {
				monstros += g;
			}
		}
		
		
		
		//int numMur = (int) Math.floor(monstros / tamMur + 1);	
		
		int numMur = 1;
		
		if(monstros > 0) {
			int torre = tamMur;
			while(torre > monstros) {
				torre -= monstros;
				
			}
			numMur ++;
			torre = tamMur;
		}
		
		System.out.println(numMur);
		
	}
}
