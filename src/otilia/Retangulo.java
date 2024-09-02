package otilia;

	public class Retangulo {
		private double altura;
		private double largura;
		
		public Retangulo(double altura, double largura) {
			super();
			this.altura = altura;
			this.largura = largura;
		}
		// construtor
		// getters e setters
		
		public double calcularArea() {
		return(largura*altura);
		}
		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		public double getLargura() {
			return largura;
		}

		public void setLargura(double largura) {
			this.largura = largura;
		}

		public double calcularPerimetro() {
		return(2*(largura+altura));
		}
		}

