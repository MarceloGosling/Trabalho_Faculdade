import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do pão: R$ ");
        double precoPao = scanner.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double preco = quantidade * precoPao;
            System.out.println(quantidade + " - R$ " + String.format("%.2f", preco));
        }

        scanner.close();
    }
}
