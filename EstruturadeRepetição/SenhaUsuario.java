import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        while (senha.equals(nomeUsuario)) {
            System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            System.out.print("Digite sua senha novamente: ");
            senha = scanner.nextLine();
        }
        
        System.out.println("Usuário e senha cadastrados com sucesso!");
        
        scanner.close();
    }
}
