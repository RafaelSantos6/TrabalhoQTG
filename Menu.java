package trabalhoQTG;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        GerenciadorDeReceitas gerenciadorDeReceitas = new GerenciadorDeReceitas();

        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Adicionar Receita");
            System.out.println("2. Listar Receitas");
            System.out.println("5. Fechar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    gerenciadorDeReceitas.adicionarReceita(scanner);
                    voltarMenu(scanner);
                    break;

                case 2:
                    gerenciadorDeReceitas.listarReceitas(scanner);
                    voltarMenu(scanner);
                    break;
                
                case 5:
                    System.out.println("\nEncerrando...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    voltarMenu(scanner);
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }

    public static void voltarMenu(Scanner scanner) {
        System.out.println("\nPressione ENTER para voltar ao menu...");
        scanner.nextLine();
    }
}