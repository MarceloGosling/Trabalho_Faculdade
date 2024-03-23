import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de notas: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Número de notas inválido. Por favor, insira um número positivo.");
            return;
        }

        double soma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();

            soma += nota;
        }

        double media = soma / N;

        System.out.println("A média aritmética das " + N + " notas é: " + media);

        scanner.close();
    }
}
