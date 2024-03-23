import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a série de Fibonacci até o n-ésimo termo: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um valor de n maior que zero.");
        } else {
           
            System.out.println("Série de Fibonacci até o " + n + "n-ésimo termo:");
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int termoAnterior1 = 1;
            int termoAnterior2 = 1;
            int resultado = 0;
            for (int i = 3; i <= n; i++) {
                resultado = termoAnterior1 + termoAnterior2;
                termoAnterior1 = termoAnterior2;
                termoAnterior2 = resultado;
            }
            return resultado;
        }
    }
}
