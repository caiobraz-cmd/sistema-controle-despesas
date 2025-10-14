import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao Sistema de Gerenciamento de Despesas!");
            System.out.println("Escolha uma opção:");
            int opcaoDigitada = scanner.nextInt();

            switch (opcaoDigitada) {
                case 1 -> {
                    // entrarDespesa();
                    System.out.println("Entrar Despesa");
                }
                case 2 -> {
                    // anotarPagamento();
                    System.out.println("Anotar Pagamento");
                }
                case 3 -> {
                    // ListarDespesasEmAberto();
                    System.out.println("Listar Despesas em Aberto");
                }
                case 4 -> {
                    // ListarDespesasPagas();
                    System.out.println("Listar Despesas Pagas");
                }
                case 5 -> {
                    // GerenciarTipoDespesa();
                    System.out.println("Gerenciar Tipo de Despesa");
                }
                case 6 -> {
                    // GerenciarUsuarios();
                    System.out.println("Gerenciar Usuários");
                }
                case 7 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }
    }
}
