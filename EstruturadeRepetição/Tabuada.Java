import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 10 para a tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Por favor, insira um número entre 1 e 10.");
            return; 
        }

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
