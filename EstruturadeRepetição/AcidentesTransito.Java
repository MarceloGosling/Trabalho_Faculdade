import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cidadeMaiorIndice = 0, cidadeMenorIndice = 0;
        int maiorIndice = Integer.MIN_VALUE, menorIndice = Integer.MAX_VALUE;
        int somaVeiculos = 0, totalCidadesMenos2000 = 0, somaAcidentesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o código da cidade " + i + ": ");
            int codigoCidade = scanner.nextInt();

            System.out.print("Digite o número de veículos de passeio em 1999 na cidade " + i + ": ");
            int veiculosPasseio = scanner.nextInt();

            System.out.print("Digite o número de acidentes de trânsito com vítimas em 1999 na cidade " + i + ": ");
            int acidentesTransito = scanner.nextInt();

            int indiceAcidentes = acidentesTransito / veiculosPasseio;

            if (indiceAcidentes > maiorIndice) {
                maiorIndice = indiceAcidentes;
                cidadeMaiorIndice = codigoCidade;
            }

            if (indiceAcidentes < menorIndice) {
                menorIndice = indiceAcidentes;
                cidadeMenorIndice = codigoCidade;
            }

            somaVeiculos += veiculosPasseio;

            if (veiculosPasseio < 2000) {
                totalCidadesMenos2000++;
                somaAcidentesMenos2000 += acidentesTransito;
            }
        }

        double mediaVeiculos = (double) somaVeiculos / 5;
        double mediaAcidentesMenos2000 = totalCidadesMenos2000 > 0 ? (double) somaAcidentesMenos2000 / totalCidadesMenos2000 : 0;

        System.out.println("Maior índice de acidentes de trânsito: Cidade " + cidadeMaiorIndice + ", Índice: " + maiorIndice);
        System.out.println("Menor índice de acidentes de trânsito: Cidade " + cidadeMenorIndice + ", Índice: " + menorIndice);
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentesMenos2000);

        scanner.close();
    }
}
