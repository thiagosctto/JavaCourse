package otilia;

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    //CONSTRUTORes
    public Pessoa() {}
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //GETTERS AND SETTERS
    public String toFileFormat() {
        return String.format("%s-%d-%.2f", nome, idade, altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    
    //METODOS
    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome);
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %.2f", nome, idade, altura);
    }
}