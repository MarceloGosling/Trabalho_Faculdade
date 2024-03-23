import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        while (true) {
            System.out.print("Digite a temperatura (ou 0 para sair): ");
            double temperatura = scanner.nextDouble();

            if (temperatura == 0) {
                break;
            }

            soma += temperatura;

            if (temperatura < menor) {
                menor = temperatura;
            }

            if (temperatura > maior) {
                maior = temperatura;
            }
        }

        int totalTemperaturas = (int) (soma != 0 ? soma / menor : 0);
        double media = soma != 0 ? soma / totalTemperaturas : 0;

        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);

        scanner.close();
    }
}
