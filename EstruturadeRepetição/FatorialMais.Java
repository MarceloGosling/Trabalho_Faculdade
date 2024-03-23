import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial (ou digite -1 para sair): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero < 0 || numero >= 16) {
                System.out.println("Número inválido. Por favor, insira um número inteiro positivo menor que 16.");
                continue;
            }

            long fatorial = calcularFatorial(numero);

            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
