package atividade;
public class Atv1 {
    public static int somatorioRecursivo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somatorioRecursivo(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10; // Exemplo de uso
        System.out.println("O somatório de 1 até " + n + " é " + somatorioRecursivo(n));
    }
}
