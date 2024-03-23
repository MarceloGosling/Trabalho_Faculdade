public class Main {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double preco = quantidade * 1.99;
            System.out.println(quantidade + " - R$ " + String.format("%.2f", preco));
        }
    }
}
