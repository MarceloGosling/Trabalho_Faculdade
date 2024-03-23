import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean primo = verificarPrimo(numero);

        if (!primo) {
            ArrayList<Integer> divisores = encontrarDivisores(numero);
            System.out.println(numero + " não é um número primo.");
            System.out.print("Ele é divisível por: ");
            for (int i = 0; i < divisores.size(); i++) {
                System.out.print(divisores.get(i));
                if (i < divisores.size() - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println(numero + " é um número primo.");
        }

        scanner.close();
    }

    public static boolean verificarPrimo(int numero) {
      
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> encontrarDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
}
