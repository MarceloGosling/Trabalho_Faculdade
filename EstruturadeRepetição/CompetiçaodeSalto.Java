import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> saltos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do atleta (ou 'FIM' para encerrar): ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.println("Atleta: " + nomeAtleta);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a distância alcançada no " + getOrdinal(i) + " salto: ");
                double distancia = scanner.nextDouble();
                saltos.add(distancia);
            }

            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);

            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);

            double soma = 0;
            for (double salto : saltos) {
                soma += salto;
            }

            double media = soma / 3;

            System.out.println("\nMelhor salto:  " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + media + " m");

            System.out.println("\nResultado final:");
            System.out.println(nomeAtleta + ": " + media + " m");

            saltos.clear();
            scanner.nextLine(); 
        }

        scanner.close();
    }

    public static String getOrdinal(int number) {
        String[] ordinais = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        return ordinais[number - 1];
    }
}
