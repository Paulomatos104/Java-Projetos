import java.util.Scanner;

public class cadastro {
    public static void Cadastrar() {
        Scanner scanner = new Scanner(System.in);
        String respostaString = "N"; // Inicializa com "N" para entrar no loop

        while (respostaString.equalsIgnoreCase("N")) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Digite seu Bloco: ");
            String bloco = scanner.nextLine();

            System.out.print("Digite seu Apartamento: ");
            String numApto = scanner.nextLine();

            System.out.println("\nResumo dos dados:");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
            System.out.println("Bloco: " + bloco);
            System.out.println("Apartamento: " + numApto);

            System.out.print("\nSeus dados estão corretos? (S/N): ");
            respostaString = scanner.nextLine();
        }

        scanner.close();

        System.out.println("Dados cadastrados com sucesso!");
    }
}
