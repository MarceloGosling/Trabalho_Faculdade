import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCDs = scanner.nextInt();

        if (quantidadeCDs <= 0) {
            System.out.println("Quantidade de CDs inválida. Por favor, insira um número positivo.");
            return;
        }

        double valorTotalInvestido = 0;

        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Digite o valor investido no CD " + i + ": R$ ");
            double valorCD = scanner.nextDouble();

            if (valorCD < 0) {
                System.out.println("Valor do CD inválido. Por favor, insira um valor não negativo.");
                return;
            }

            valorTotalInvestido += valorCD;
        }

        double valorMedioPorCD = valorTotalInvestido / quantidadeCDs;

        System.out.println("O valor total investido na coleção de CDs é: R$ " + valorTotalInvestido);
        System.out.println("O valor médio gasto em cada CD é: R$ " + valorMedioPorCD);

        scanner.close();
    }
}
