package atividade;

public class ConversaoDeUnidadesDeArea {
	// Conversão de metros quadrados para pés quadrados
    public static double metrosQuadradosParaPesQuadrados(double metrosQuadrados) {
        return metrosQuadrados * 10.76;
    }

    // Conversão de pés quadrados para centímetros quadrados
    public static double pesQuadradosParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929;
    }

    // Conversão de milhas quadradas para acres
    public static double milhasQuadradasParaAcres(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    // Conversão de acres para pés quadrados
    public static double acresParaPesQuadrados(double acres) {
        return acres * 43560;
    }

    public static void main(String[] args) {
        // Exemplos de uso dos métodos de conversão

        double metrosQuadrados = 1;
        double pesQuadrados = 1;
        double milhasQuadradas = 1;
        double acres = 1;

        System.out.println(metrosQuadrados + " metros quadrados são equivalentes a " +
                           metrosQuadradosParaPesQuadrados(metrosQuadrados) + " pés quadrados.");
        
        System.out.println(pesQuadrados + " pés quadrados são equivalentes a " +
                           pesQuadradosParaCentimetrosQuadrados(pesQuadrados) + " centímetros quadrados.");
        
        System.out.println(milhasQuadradas + " milhas quadradas são equivalentes a " +
                           milhasQuadradasParaAcres(milhasQuadradas) + " acres.");
        
        System.out.println(acres + " acres são equivalentes a " +
                           acresParaPesQuadrados(acres) + " pés quadrados.");
    }
}