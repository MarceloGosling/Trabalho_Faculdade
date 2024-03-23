import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        double H = 0;

        for (int i = 1; i <= N; i++) {
            H += 1.0 / i;
        }

        System.out.println("O valor de H com " + N + " termos é: " + H);

        scanner.close();
    }
}
