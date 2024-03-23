
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = 0;

        if (numero1 <= numero2) {
           
            System.out.println("Números no intervalo de " + numero1 + " e " + numero2 + ":");
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
                soma += i;
            }
        } else {
            
            System.out.println("Números no intervalo de " + numero2 + " e " + numero1 + ":");
            for (int i = numero2; i <= numero1; i++) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("A soma dos números no intervalo é: " + soma);

        scanner.close();
    }
}

