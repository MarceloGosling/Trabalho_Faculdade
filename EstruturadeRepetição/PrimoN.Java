import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();

        int divisoes = 0;

        System.out.println("Números primos entre 1 e " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (verificarPrimo(i, divisoes)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmero total de divisões realizadas: " + divisoes);

        scanner.close();
    }

    public static boolean verificarPrimo(int numero, int contadorDivisoes) {
        
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            contadorDivisoes++; 
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
