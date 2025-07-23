import java.util.Scanner;

public class qtdImparPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        String resposta;
        int countPar = 0;
        int countImpar = 0;

        do {
            System.out.print("Entre com um número: ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                countPar++;
            } else {
                countImpar++;
            }

            // Consumir quebra de linha pendente do nextInt
            scanner.nextLine();

            System.out.print("Se deseja encerrar digite 0 (zero), ou precione enter: ");
            resposta = scanner.nextLine();

        } while (!resposta.equals("0"));

        System.out.println("Quantidade de números pares digitados: " + countPar);
        System.out.println("Quantidade de números ímpares digitados: " + countImpar);

        scanner.close();
    }
}
