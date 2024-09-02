package otilia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCalculadoraSubtrair {

			@Test
			@DisplayName("Deveria subtrair dois inteiros positivos")
			public void deveriaSubrairDoisInteirosPositivos() {
				Calculadora calc = new Calculadora();
				int subtracao = calc.subtrair(5, 1);
				Assert.assertEquals(4, subtracao);
			}
			
			@Test
			@DisplayName("Deveria subtrair um numero positivo e um negativo")
			public void deveriaSubrairPosNeg() {
				Calculadora calc = new Calculadora();
				int subtracao = calc.subtrair(5, -1);
				Assert.assertEquals(6, subtracao);
			}
			
			@Test
			@DisplayName("Deveria subtrair dois numeros negativos")
			public void deveriaSubrairDoisNegativos() {
				Calculadora calc = new Calculadora();
				int subtracao = calc.subtrair(-5, -1);
				Assert.assertEquals(-4, subtracao);
			}
			
			@Test
			@DisplayName("Deveria subtrair numeros negativos com 0")
			public void deveriaSubrairInt() {
				Calculadora calc = new Calculadora();
				int subtracao = calc.subtrair(-5, 0);
				int subtracao2 = calc.subtrair(0, -5);
				Assert.assertEquals(-5, subtracao);
				Assert.assertEquals(5, subtracao2);
			}
}