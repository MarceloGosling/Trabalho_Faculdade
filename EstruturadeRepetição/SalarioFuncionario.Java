import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: R$ ");
        double salarioInicial = scanner.nextDouble();

        double salarioAtual = salarioInicial;
        double percentualAumento = 0.015;

        for (int ano = 1996; ano <= 2022; ano++) {
            salarioAtual *= (1 + percentualAumento);
            percentualAumento *= 2;
        }

        System.out.println("O salário atual do funcionário é: R$ " + salarioAtual);

        scanner.close();
    }
}
