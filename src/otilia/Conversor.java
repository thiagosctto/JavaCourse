package otilia;

public class Conversor {
	
	public Float qtdDolar;
	public Float cotDolar;
	public static Float iof = (float) 1.06;
	public Float reais;
	
	public Conversor(Float qtdDolar, Float cotDolar) {
		this.qtdDolar = qtdDolar;
		this.cotDolar = cotDolar;
	}
	
	public float Converter() {
		reais = (qtdDolar * cotDolar * iof);
		return reais;
	}
	
}