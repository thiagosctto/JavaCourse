package beecrownd;

import java.util.Scanner;

public class Bee2061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.next();
		for (int i=0;i<m;i++) {	
			String op = sc.nextLine();
			if(op.equals("fechou") == true) {
				n ++;
			}else {
				n --;
			}
		}
		System.out.println(n);
		sc.close();
	}
}
