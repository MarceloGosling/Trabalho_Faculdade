import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosCandidato4 = 0;
        int votosNulos = 0, votosBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite o código do voto (ou 0 para encerrar a votação): ");
            int codigoVoto = scanner.nextInt();

            if (codigoVoto == 0) {
                break;
            }

            switch (codigoVoto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                default:
                    System.out.println("Código de voto inválido.");
            }

            totalVotos++;
        }

        System.out.println("Total de votos para o Candidato 1: " + votosCandidato1);
        System.out.println("Total de votos para o Candidato 2: " + votosCandidato2);
        System.out.println("Total de votos para o Candidato 3: " + votosCandidato3);
        System.out.println("Total de votos para o Candidato 4: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBranco);
        System.out.println("Percentagem de votos nulos sobre o total de votos: " + ((double) votosNulos / totalVotos * 100) + "%");
        System.out.println("Percentagem de votos em branco sobre o total de votos: " + ((double) votosBranco / totalVotos * 100) + "%");

        scanner.close();
    }
}
