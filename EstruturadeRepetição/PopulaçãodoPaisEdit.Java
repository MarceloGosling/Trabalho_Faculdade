import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            int populacaoA;
            double taxaCrescimentoA;
            do {
                System.out.print("Digite a população inicial do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("População inicial inválida. A população deve ser maior que zero.");
                }
            } while (populacaoA <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual do país A (em decimal, por exemplo, 0.03 para 3%): ");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("Taxa de crescimento inválida. A taxa deve ser maior que zero.");
                }
            } while (taxaCrescimentoA <= 0);

            int populacaoB;
            double taxaCrescimentoB;
            do {
                System.out.print("Digite a população inicial do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("População inicial inválida. A população deve ser maior que zero.");
                }
            } while (populacaoB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual do país B (em decimal, por exemplo, 0.015 para 1.5%): ");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("Taxa de crescimento inválida. A taxa deve ser maior que zero.");
                }
            } while (taxaCrescimentoB <= 0);

            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            System.out.println("Número de anos necessários para a população do país A ultrapassar ou igualar a do país B: " + anos);

            System.out.print("Deseja repetir a operação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
