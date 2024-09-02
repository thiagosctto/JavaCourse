package otilia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class RetanguloTest {

	    @Test
	    public void testCalcularArea() {
	        // Criando uma instância do Retangulo
	        Retangulo retangulo = new Retangulo();
	        retangulo.setAltura(5.0);
	        retangulo.setLargura(4.0);
	        
	        // Verificando o cálculo da área
	        double areaEsperada = 20.0;
	        assertEquals(areaEsperada, retangulo.calcularArea(), 0.001);
	    }

	    @Test
	    public void testCalcularPerimetro() {
	        // Criando uma instância do Retangulo
	        Retangulo retangulo = new Retangulo();
	        retangulo.setAltura(5.0);
	        retangulo.setLargura(4.0);
	        
	        // Verificando o cálculo do perímetro
	        double perimetroEsperado = 18.0;
	        assertEquals(perimetroEsperado, retangulo.calcularPerimetro(), 0.001);
	    }
	}

}
