import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunoMaisAlto = 0, alunoMaisBaixo = 0;
        int alturaMaisAlto = 0, alturaMaisBaixo = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();

            System.out.print("Digite a altura do aluno " + i + " em centímetros: ");
            int alturaAluno = scanner.nextInt();

            if (alturaAluno > alturaMaisAlto) {
                alunoMaisAlto = numeroAluno;
                alturaMaisAlto = alturaAluno;
            }

            if (alturaAluno < alturaMaisBaixo) {
                alunoMaisBaixo = numeroAluno;
                alturaMaisBaixo = alturaAluno;
            }
        }

        System.out.println("Aluno mais alto: Número " + alunoMaisAlto + ", Altura: " + alturaMaisAlto + " cm");
        System.out.println("Aluno mais baixo: Número " + alunoMaisBaixo + ", Altura: " + alturaMaisBaixo + " cm");

        scanner.close();
    }
}
