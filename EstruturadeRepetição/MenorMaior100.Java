import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos do conjunto: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Número de elementos inválido. Por favor, insira um número positivo.");
            return;
        }

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Digite os números do conjunto (entre 0 e 1000):");

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0 || numero > 1000) {
                System.out.println("Número inválido. Por favor, insira um número entre 0 e 1000.");
                return;
            }

            menorValor = Math.min(menorValor, numero);
            maiorValor = Math.max(maiorValor, numero);
            soma += numero;
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);

        scanner.close();
    }
}

