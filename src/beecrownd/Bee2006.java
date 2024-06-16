package beecrownd;

import java.util.Scanner;

public class Bee2006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
		int [] vect = new int[5];
		for (int i=0;i<vect.length;i++) {
			vect[i] = sc.nextInt();
			if (vect[i] == t) {
				count ++;
			}
		}
	System.out.println(count);	
	sc.close();
	}
}
