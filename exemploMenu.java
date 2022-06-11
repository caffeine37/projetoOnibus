import java.util.Scanner;

public class exemploMenu {

    enum Color {
        // Color end string, color reset
        RESET("\033[0m"),

        // Regular Colors. Normal color, no bold, background color etc.
        BLACK("\033[0;30m"), // BLACK
        RED("\033[0;31m"), // RED
        GREEN("\033[0;32m"), // GREEN
        YELLOW("\033[0;33m"), // YELLOW
        BLUE("\033[0;34m"), // BLUE
        MAGENTA("\033[0;35m"), // MAGENTA
        CYAN("\033[0;36m"), // CYAN
        WHITE("\033[0;37m"), // WHITE

        // Bold
        BLACK_BOLD("\033[1;30m"), // BLACK
        RED_BOLD("\033[1;31m"), // RED
        GREEN_BOLD("\033[1;32m"), // GREEN
        YELLOW_BOLD("\033[1;33m"), // YELLOW
        BLUE_BOLD("\033[1;34m"), // BLUE
        MAGENTA_BOLD("\033[1;35m"), // MAGENTA
        CYAN_BOLD("\033[1;36m"), // CYAN
        WHITE_BOLD("\033[1;37m"), // WHITE

        // Underline
        BLACK_UNDERLINED("\033[4;30m"), // BLACK
        RED_UNDERLINED("\033[4;31m"), // RED
        GREEN_UNDERLINED("\033[4;32m"), // GREEN
        YELLOW_UNDERLINED("\033[4;33m"), // YELLOW
        BLUE_UNDERLINED("\033[4;34m"), // BLUE
        MAGENTA_UNDERLINED("\033[4;35m"), // MAGENTA
        CYAN_UNDERLINED("\033[4;36m"), // CYAN
        WHITE_UNDERLINED("\033[4;37m"), // WHITE

        // Background
        BLACK_BACKGROUND("\033[40m"), // BLACK
        RED_BACKGROUND("\033[41m"), // RED
        GREEN_BACKGROUND("\033[42m"), // GREEN
        YELLOW_BACKGROUND("\033[43m"), // YELLOW
        BLUE_BACKGROUND("\033[44m"), // BLUE
        MAGENTA_BACKGROUND("\033[45m"), // MAGENTA
        CYAN_BACKGROUND("\033[46m"), // CYAN
        WHITE_BACKGROUND("\033[47m"), // WHITE

        // High Intensity
        BLACK_BRIGHT("\033[0;90m"), // BLACK
        RED_BRIGHT("\033[0;91m"), // RED
        GREEN_BRIGHT("\033[0;92m"), // GREEN
        YELLOW_BRIGHT("\033[0;93m"), // YELLOW
        BLUE_BRIGHT("\033[0;94m"), // BLUE
        MAGENTA_BRIGHT("\033[0;95m"), // MAGENTA
        CYAN_BRIGHT("\033[0;96m"), // CYAN
        WHITE_BRIGHT("\033[0;97m"), // WHITE

        // Bold High Intensity
        BLACK_BOLD_BRIGHT("\033[1;90m"), // BLACK
        RED_BOLD_BRIGHT("\033[1;91m"), // RED
        GREEN_BOLD_BRIGHT("\033[1;92m"), // GREEN
        YELLOW_BOLD_BRIGHT("\033[1;93m"), // YELLOW
        BLUE_BOLD_BRIGHT("\033[1;94m"), // BLUE
        MAGENTA_BOLD_BRIGHT("\033[1;95m"), // MAGENTA
        CYAN_BOLD_BRIGHT("\033[1;96m"), // CYAN
        WHITE_BOLD_BRIGHT("\033[1;97m"), // WHITE

        // High Intensity backgrounds
        BLACK_BACKGROUND_BRIGHT("\033[0;100m"), // BLACK
        RED_BACKGROUND_BRIGHT("\033[0;101m"), // RED
        GREEN_BACKGROUND_BRIGHT("\033[0;102m"), // GREEN
        YELLOW_BACKGROUND_BRIGHT("\033[0;103m"), // YELLOW
        BLUE_BACKGROUND_BRIGHT("\033[0;104m"), // BLUE
        MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"), // MAGENTA
        CYAN_BACKGROUND_BRIGHT("\033[0;106m"), // CYAN
        WHITE_BACKGROUND_BRIGHT("\033[0;107m"); // WHITE

        private final String code;

        Color(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }

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
            System.out.print(Color.YELLOW);
            System.out.println(op);
            System.out.print(Color.RESET);
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
