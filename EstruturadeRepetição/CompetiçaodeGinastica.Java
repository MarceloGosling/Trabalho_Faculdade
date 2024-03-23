import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do ginasta: ");
        String nomeGinasta = scanner.nextLine();

        List<Double> notas = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        double melhorNota = Collections.max(notas);
        double piorNota = Collections.min(notas);

        notas.remove(melhorNota);
        notas.remove(piorNota);

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / 5;

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + nomeGinasta);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
