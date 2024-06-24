package otilia;

import java.io.*;
import java.util.*;

public class Arquivos {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Luis", 25, 1.65));
        pessoas.add(new Pessoa("Carlos", 30, 1.80));
        pessoas.add(new Pessoa("Erika", 22, 1.70));

        Collections.sort(pessoas);

        String nomeArquivo = "PessoaFile.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (Pessoa pessoa : pessoas) {
                writer.println(pessoa.getNome() + "-" + pessoa.getIdade() + "-" + pessoa.getAltura());
            }
            System.out.println("Dados gravados em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("\nConteúdo lido de " + nomeArquivo + ":");
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split("-");
                String nome = dados[0];
                int idade = Integer.parseInt(dados[1]);
                double altura = Double.parseDouble(dados[2]);
                Pessoa pessoa = new Pessoa(nome, idade, altura);
                System.out.println(pessoa);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
