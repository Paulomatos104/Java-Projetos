import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Sistema de Cadastro");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Escolha uma opção:");
            System.out.println("Opção 1 - CADASTRAR");
            System.out.println("Opção 2 - MEUS DADOS");
            System.out.println("Opção 3 - ATUALIZAR");
            System.out.println("Opção 4 - DELETAR");
            System.out.println("Opção 5 - SAIR");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastro.Cadastrar();
                    break;

            }
        }

        
    }
        
        
        

    
}
