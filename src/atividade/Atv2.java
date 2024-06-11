package atividade;

public class Atv2 {
    public static int somaVetor(int[] v, int n) {
        if (n == 0) {
            return 0;
        } else {
            return v[n - 1] + somaVetor(v, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5}; // Exemplo de uso
        int n = v.length;
        System.out.println("A soma dos elementos do vetor é " + somaVetor(v, n));
    }
}
