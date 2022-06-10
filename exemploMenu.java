import java.util.Scanner;

public class exemploMenu {

    // Função para limpar console
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // imprimiri menu
    public static void printMenu(String[] options) {

        // classic for
        // for (int i = 0; i < options.length; i++) {
        // System.out.println(options[i]);
        // }

        // enhanced for
        for (String op : options) {
            System.out.println(op);
        }
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 1;

        while (option != 4) {
            String[] options = { "1 - Opcao 1", "2 - Opcao 2", "3 - Opcao 3", "4 - Sair" };

            // invovar a funçao de impressão de menu
            printMenu(options);

            // depois de exibir o menu le a opção escolhida e salva em option
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Por favor, entre com um inteiro entre 1 e " + options.length);
                scanner.next();
            }

            /*
             * if(option == 1) {
             * System.out.println("Opção 1 escolhida");
             * } else if (option == 2) {
             * System.out.println("Opção 2 escolhida");
             * } else if (option == 3) {
             * System.out.println("Opção 3 escolhida");
             * } else {
             * System.out.println("Saindo...");
             * exit(0);
             * }
             */

        }

        scanner.close();

    }

    // Função que irá ser executada quando a opção 1 for escolhida
    public static void option1() {
        System.out.println("Opção 1 escolhida");
    }

    // Função que irá ser executada quando a opção 2 for escolhida
    public static void option2() {
        System.out.println("Opção 2 escolhida");
    }

    // Função que irá ser executada quando a opção 1 for escolhida
    public static void option3() {
        System.out.println("Opção 3 escolhida");
    }

    private static void exit(int i) {
    }
}
