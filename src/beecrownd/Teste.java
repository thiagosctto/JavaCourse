package beecrownd;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH");
		 System.out.println("inicial");
		 LocalDateTime horaInicial = LocalDateTime.of
		 System.out.println("final");
		 LocalDateTime horaFinal = LocalDateTime.parse(sc.nextLine(),fmt);
		 
		 int horas = Duration.between(horaInicial, horaFinal).toHoursPart();
		 
		 System.out.println("O JOGO DUROU "+horas+" HORA(S)");
		 
	      sc.close();
	}
}
