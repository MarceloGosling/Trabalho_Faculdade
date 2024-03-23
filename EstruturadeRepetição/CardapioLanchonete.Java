import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalGeral = 0;

        System.out.println("Cardápio da lanchonete:");
        System.out.println("Especificação\tCódigo\tPreço");
        System.out.println("Cachorro Quente\t100\tR$ 1,20");
        System.out.println("Bauru Simples\t101\tR$ 1,30");
        System.out.println("Bauru com ovo\t102\tR$ 1,50");
        System.out.println("Hambúrguer\t103\tR$ 1,20");
        System.out.println("Cheeseburguer\t104\tR$ 1,30");
        System.out.println("Refrigerante\t105\tR$ 1,00");

        while (true) {
            System.out.print("Digite o código do item (ou 0 para encerrar o pedido): ");
            int codigoItem = scanner.nextInt();

            if (codigoItem == 0) {
                break;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            double precoItem = 0;

            switch (codigoItem) {
                case 100:
                    precoItem = 1.20;
                    break;
                case 101:
                    precoItem = 1.30;
                    break;
                case 102:
                    precoItem = 1.50;
                    break;
                case 103:
                    precoItem = 1.20;
                    break;
                case 104:
                    precoItem = 1.30;
                    break;
                case 105:
                    precoItem = 1.00;
                    break;
                default:
                    System.out.println("Código de item inválido.");
            }

            double valorItem = precoItem * quantidade;
            totalGeral += valorItem;

            System.out.println("Valor a ser pago pelo item: R$ " + String.format("%.2f", valorItem));
        }

        System.out.println("Total geral do pedido: R$ " + String.format("%.2f", totalGeral));

        scanner.close();
    }
}
