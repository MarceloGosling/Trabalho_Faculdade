import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + limiteSuperior + ":");
        for (int numero = 2; numero <= limiteSuperior; numero++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }
}
