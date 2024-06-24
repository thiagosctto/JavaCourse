package otilia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arch {
    public static void main(String[] args) {
        List<ClasseTeste> vetor = new ArrayList<>();
        vetor.add(new ClasseTeste(1, 10.1, "abc"));
        vetor.add(new ClasseTeste(2, 20.2, "xyz"));
        vetor.add(new ClasseTeste(3, 30.3, "klm"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))) {
            for (ClasseTeste ct : vetor) {
                writer.write(ct.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<ClasseTeste> novoVetor = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] temporaria = linha.split(",");
                int n1 = Integer.parseInt(temporaria[0]);
                double n2 = Double.parseDouble(temporaria[1]);
                String t1 = temporaria[2];
                novoVetor.add(new ClasseTeste(n1, n2, t1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (ClasseTeste ct : novoVetor) {
            System.out.println(ct);
        }
    }
}
