import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Despesa> listaDespesas = new ArrayList<>();

    //  Método para cadastrar uma nova despesa
    public static void entrarDespesa(Scanner scanner) {
        System.out.print("Digite a descrição da despesa: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o valor da despesa: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Data de vencimento (dd/mm/aaaa): ");
        String dataVencimento = scanner.nextLine();

        System.out.print("Tipo de despesa: ");
        String tipoDespesa = scanner.nextLine();

        System.out.print("Pagamento parcelado ou à vista (P/A): ");
        String pagamento = scanner.nextLine();

        Despesa novaDespesa; 

        if (pagamento.equalsIgnoreCase("A")) { 
            novaDespesa = new DespesaAvista(descricao, valor, dataVencimento, tipoDespesa);
        } else { 
            novaDespesa = new DespesaParcelada(descricao, valor, dataVencimento, tipoDespesa, 0);
        }

        listaDespesas.add(novaDespesa);
        System.out.println("✅ Despesa adicionada com sucesso!");
    }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistema de Controle de Despesas ===");
            System.out.println("1 - Entrar Despesa");
            System.out.println("2 - Anotar Pagamento");
            System.out.println("3 - Listar Despesas em Aberto");
            System.out.println("4 - Listar Despesas Pagas");
            System.out.println("5 - Gerenciar Tipo de Despesa");
            System.out.println("6 - Gerenciar Usuários");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcaoDigitada = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcaoDigitada) {
                case 1 -> {entrarDespesa(scanner); 
                System.out.println("Lista atual de despesas: " + listaDespesas);}
                case 2 -> System.out.println("Função de anotar pagamento ainda será implementada.");
                case 3 -> System.out.println("Função de listar despesas em aberto ainda será implementada.");
                case 4 -> System.out.println("Função de listar despesas pagas ainda será implementada.");
                case 5 -> System.out.println("Função de gerenciar tipo de despesa ainda será implementada.");
                case 6 -> System.out.println("Função de gerenciar usuários ainda será implementada.");
                case 7 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
