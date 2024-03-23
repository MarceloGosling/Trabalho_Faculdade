import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Número de pessoas inválido. Por favor, insira um número positivo.");
            return;
        }

        int somaIdades = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida. Por favor, insira uma idade não negativa.");
                return;
            }

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / N;

        String faixaEtaria;
        if (mediaIdades >= 0 && mediaIdades <= 25) {
            faixaEtaria = "jovem";
        } else if (mediaIdades >= 26 && mediaIdades <= 60) {
            faixaEtaria = "adulta";
        } else {
            faixaEtaria = "idosa";
        }

        System.out.println("A turma é " + faixaEtaria + " com uma média de idade de " + mediaIdades + " anos.");

        scanner.close();
    }
}
