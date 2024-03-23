import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double valorDivida = 1000.00;
        double valorJuros = 0;
        int quantidadeParcelas = 1;
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");

        for (int i = 0; i < 5; i++) {
            double valorParcela = valorDivida / quantidadeParcelas;
            System.out.println("R$ " + df.format(valorDivida) + "\t\tR$ " + df.format(valorJuros) + "\t\t\t" + quantidadeParcelas + "\t\t\t\tR$ " + df.format(valorParcela));

            switch (quantidadeParcelas) {
                case 1:
                    valorJuros = 0;
                    quantidadeParcelas = 3;
                    break;
                case 3:
                    valorJuros = valorDivida * 0.10;
                    quantidadeParcelas = 6;
                    break;
                case 6:
                    valorJuros = valorDivida * 0.15;
                    quantidadeParcelas = 9;
                    break;
                case 9:
                    valorJuros = valorDivida * 0.20;
                    quantidadeParcelas = 12;
                    break;
                case 12:
                    valorJuros = valorDivida * 0.25;
                    quantidadeParcelas = 1;
                    break;
            }

            valorDivida += valorJuros;
        }
    }
}
