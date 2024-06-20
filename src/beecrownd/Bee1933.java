package beecrownd;
import java.util.Scanner;
public class Bee1933 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = 0;
		if(n1 == n2) {
			n3 = n1;
		}else if(n1 > n2) {
			n3 = n1;
		}else n3 = n2;
		System.out.println(n3);
		sc.close();
	}
}