import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        if (quantidadeTurmas <= 0) {
            System.out.println("Quantidade de turmas inválida. Por favor, insira um número positivo.");
            return;
        }

        int totalAlunos = 0;

        for (int i = 1; i <= quantidadeTurmas; i++) {
            System.out.print("Digite a quantidade de alunos na turma " + i + ": ");
            int quantidadeAlunos = scanner.nextInt();

            if (quantidadeAlunos < 0 || quantidadeAlunos > 40) {
                System.out.println("Quantidade de alunos inválida. Por favor, insira um número entre 0 e 40.");
                return;
            }

            totalAlunos += quantidadeAlunos;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

        System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);

        scanner.close();
    }
}
