import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Digite seu nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        int idade;
        do {
            System.out.print("Digite sua idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.print("Digite seu salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        char sexo;
        do {
            System.out.print("Digite seu sexo ('f' para feminino, 'm' para masculino): ");
            sexo = scanner.next().charAt(0);
            sexo = Character.toLowerCase(sexo);
        } while (sexo != 'f' && sexo != 'm');

        char estadoCivil;
        do {
            System.out.print("Digite seu estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado): ");
            estadoCivil = scanner.next().charAt(0);
            estadoCivil = Character.toLowerCase(estadoCivil);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\nInformações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + (estadoCivil == 's' ? "Solteiro" : estadoCivil == 'c' ? "Casado" : estadoCivil == 'v' ? "Viúvo" : "Divorciado"));

        scanner.close();
    }
}
