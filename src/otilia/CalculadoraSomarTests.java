package otilia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraSomarTests {

		// testes para o método somar
		@Test
		@DisplayName("Deveria somar dois inteiros positivos")
		public void deveriaSomarDoisInteirosPositivos() {
		// cenário (arrange)
		Calculadora calc = new Calculadora();
		
		// execução (act)
		int soma = calc.somar(41, 1);
		// verificação (assert)
		Assert.assertEquals(42, soma);
		}
		@Test
		@DisplayName("Deveria somar um inteiro positivo com zero")
		public void deveriaSomarUmInteiroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
		}
		@Test
		public void deveriaSomarUmInteiroPositivoEUmNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, -5);
		Assert.assertEquals(0, soma);
		}
		@Test
		public void deveriaSomarDoisInteirosNegativos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-2, -3);
		Assert.assertEquals(-5, soma);
	}
}
