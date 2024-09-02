package otilia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCalculadoraDividir {

	@Test
	@DisplayName("Deveria dividir dois inteiros positivos")
	public void deveriaDividirDoisInteirosPositivos() {
		Calculadora calc = new Calculadora();
		double qoc = calc.dividir(5.00, 1.00);
		assertEquals(5.00, qoc, 0.01);
	}
	
	@Test
	@DisplayName("Deveria dividir um número positivo e um negativo")
	public void deveriaDividirPosNeg() {
		Calculadora calc = new Calculadora();
		double qoc = calc.dividir(5.00, -1.00);
		assertEquals(-5.00, qoc, 0.1);
	}
	
	@Test
	@DisplayName("Deveria dividir dois números negativos")
	public void deveriaDividirDoisNegativos() {
		Calculadora calc = new Calculadora();
		double qoc = calc.dividir(-5.00, -1.00);
		assertEquals(5.00, qoc, 0.001);
	}
	
	@Test
	@DisplayName("Deveria dividir um número por zero e lançar exceção")
	public void deveriaDividirPorZero() {
		Calculadora calc = new Calculadora();
		assertThrows(ArithmeticException.class, () -> {
			calc.dividir(5.00, 0.00);
		});
	}

}
