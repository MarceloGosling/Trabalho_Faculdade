import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        if (totalEleitores <= 0) {
            System.out.println("Número de eleitores inválido. Por favor, insira um número positivo.");
            return;
        }

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ", vote em um dos candidatos (1, 2 ou 3): ");
            int voto = scanner.nextInt();

            if (voto < 1 || voto > 3) {
                System.out.println("Voto inválido. Por favor, vote em um dos candidatos (1, 2 ou 3).");
                continue;
            }

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
            }
        }

        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        scanner.close();
    }
}
