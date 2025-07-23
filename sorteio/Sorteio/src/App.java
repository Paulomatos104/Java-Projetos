import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Sorteio da Ana 100% confiável");
            System.out.println("Escreva 'sim' para confirmar ou qualquer outra coisa para sair:");
            resposta = scanner.nextLine();

            if (resposta.equals("sim")) {
                System.out.println("Sorteando...");
                
                try {
                    Thread.sleep(5000); // espera 5 segundos
                } catch (InterruptedException e) {
                    System.out.println("Erro ao esperar!");
                }

                System.out.println("Número sorteado: 56");
            }

        } while (resposta.equals("sim"));

        scanner.close();
    }
}
