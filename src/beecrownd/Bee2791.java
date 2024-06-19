package beecrownd;

import java.util.Scanner;

public class Bee2791 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] c = new int[4];
		
		for(int i=0;i<c.length;i++) {
			c[i] = sc.nextInt();
		}
		
		for(int i=0;i<c.length;i++) {
			if(c[i] == 1) {
				System.out.println(i+1);
			}
		}
		
		sc.close();
	}
}
