import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        media = (double) soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}
