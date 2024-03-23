import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produtoNumero = 1;
        double totalCompra = 0;

        System.out.println("Lojas Tabajara");

        while (true) {
            System.out.print("Produto " + produtoNumero + ": R$ ");
            double precoProduto = scanner.nextDouble();

            if (precoProduto == 0) {
                break;
            }

            totalCompra += precoProduto;
            produtoNumero++;
        }

        System.out.println("Total: R$ " + totalCompra);

        System.out.print("Dinheiro: R$ ");
        double dinheiroRecebido = scanner.nextDouble();

        double troco = dinheiroRecebido - totalCompra;
        System.out.println("Troco: R$ " + troco);

        scanner.close();
    }
}
