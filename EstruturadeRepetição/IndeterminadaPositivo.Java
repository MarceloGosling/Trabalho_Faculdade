import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo4++;
            }
        }

        System.out.println("Quantidade de números no intervalo [0-25]: " + intervalo1);
        System.out.println("Quantidade de números no intervalo [26-50]: " + intervalo2);
        System.out.println("Quantidade de números no intervalo [51-75]: " + intervalo3);
        System.out.println("Quantidade de números no intervalo [76-100]: " + intervalo4);

        scanner.close();
    }
}
