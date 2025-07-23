import java.util.Scanner;
public class Cadastro{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int opcao;

        do {
            System.out.println("\n=== MENU CRUD ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                //case 2:
                 //   listar();
                 //   break;
               // case 3:
                  //  atualizar();
                 //   break;
                //case 4:
                //    deletar();
                //    break;
                //case 5:
                //    System.out.println("Saindo do sistema...");
                //    break;
                default:
                    System.out.println("❌ Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    public static void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        String resposta = "N"; // Inicializa com "N" para entrar no loop

        do {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Digite seu bloco: ");
            String bloco = scanner.nextLine();

            System.out.print("Digite seu apartamento: ");
            String numApto = scanner.nextLine();

            // Exibir dados
            System.out.println("\nResumo dos dados:");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
            System.out.println("Bloco: " + bloco);
            System.out.println("Apartamento: " + numApto);

            System.out.print("\nEsses dados estão corretos? (S/N): ");
            resposta = scanner.nextLine().trim().toUpperCase();
        } while (!resposta.equals("S"));

        System.out.println("Dados cadastrados com sucesso!");
        scanner.close();
    }
}
