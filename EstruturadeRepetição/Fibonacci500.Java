public class Main {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
        System.out.print(primeiroTermo + " " + segundoTermo + " ");

        int proximoTermo = primeiroTermo + segundoTermo;

        while (proximoTermo <= 500) {
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            proximoTermo = primeiroTermo + segundoTermo;
        }
    }
}
