import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        double soma = 0;
        int numerador = 1;
        int denominador = 1;

        for (int i = 1; i <= n; i++) {
            soma += (double) numerador / denominador;
            System.out.print(numerador + "/" + denominador);
            
            if (i < n) {
                System.out.print(" + ");
            }

            numerador++;
            denominador += 2;
        }

        System.out.println("\nSoma da série: " + soma);

        scanner.close();
    }
}
