import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 0;
        int maiorAcerto = 0, menorAcerto = 10;
        int somaNotas = 0;

        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};

        while (true) {
            char[] respostasAluno = new char[10];
            int acertos = 0;

            System.out.println("Digite as respostas do aluno:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Resposta da questão " + (i + 1) + ": ");
                respostasAluno[i] = scanner.next().toUpperCase().charAt(0);
            }

            for (int i = 0; i < 10; i++) {
                if (respostasAluno[i] == gabarito[i]) {
                    acertos++;
                }
            }

            System.out.println("Total de acertos do aluno: " + acertos);
            double nota = acertos;
            System.out.println("Nota do aluno: " + nota);
            somaNotas += nota;

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }

            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            totalAlunos++;

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char opcao = scanner.next().toUpperCase().charAt(0);
            if (opcao == 'N') {
                break;
            }
        }

        double mediaNotas = (double) somaNotas / totalAlunos;

        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotas);

        scanner.close();
    }
}
