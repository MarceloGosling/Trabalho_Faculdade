import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int contadorClientes = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para encerrar): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso do cliente: ");
            double peso = scanner.nextDouble();

            if (altura > alturaMaisAlto) {
                codigoMaisAlto = codigo;
                alturaMaisAlto = altura;
            }

            if (altura < alturaMaisBaixo) {
                codigoMaisBaixo = codigo;
                alturaMaisBaixo = altura;
            }

            if (peso > pesoMaisGordo) {
                codigoMaisGordo = codigo;
                pesoMaisGordo = peso;
            }

            if (peso < pesoMaisMagro) {
                codigoMaisMagro = codigo;
                pesoMaisMagro = peso;
            }

            somaAlturas += altura;
            somaPesos += peso;
            contadorClientes++;
        }

        double mediaAlturas = somaAlturas / contadorClientes;
        double mediaPesos = somaPesos / contadorClientes;

        System.out.println("Cliente mais alto - Código: " + codigoMaisAlto + ", Altura: " + alturaMaisAlto);
        System.out.println("Cliente mais baixo - Código: " + codigoMaisBaixo + ", Altura: " + alturaMaisBaixo);
        System.out.println("Cliente mais gordo - Código: " + codigoMaisGordo + ", Peso: " + pesoMaisGordo);
        System.out.println("Cliente mais magro - Código: " + codigoMaisMagro + ", Peso: " + pesoMaisMagro);
        System.out.println("Média das alturas: " + mediaAlturas);
        System.out.println("Média dos pesos: " + mediaPesos);

        scanner.close();
    }
}
