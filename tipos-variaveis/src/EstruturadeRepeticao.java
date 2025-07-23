import java.util.Scanner;

public class EstruturadeRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;
        int soma = 0;
        int count = 0;
        int maior = Integer.MIN_VALUE;

        do {
            System.out.print("Nota " + (count + 1) + ": ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite um número entre 0 e 10.");
                continue; // volta para o início do loop
            }

            soma += nota;

            if (nota > maior) {
                maior = nota;
            }

            count++;

        } while (count < 5);

        int media = soma / 5;
        System.out.println("Média das notas: " + media);
        System.out.println("Maior nota: " + maior);

        scanner.close();
    }
}
