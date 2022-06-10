import java.util.Scanner;

public class Onibus{
  public static void main (String [] args){
    
    int assentos [] [] = new int [10] [4];
    int numeroAssento = 1;
    int escolha = -5;
    int escolhaAssento = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("===========>> Seja Bem Vindo ao <===========");
    System.out.println("  Sistema de reservas e vendas de assentos ");
    System.out.println();

    //Esses dois primeiros for, é para preencher a matriz com o número de assentos, no caso, preencher a matriz com números de 1 a 40.
    for (int i = 0 ; i < 10 ; i++){
      for (int j = 0 ; j < 4 ; j++){
        assentos [i] [j] = numeroAssento;
        numeroAssento++;
      }
    }


    //a variável "escolha", é entre as escolhas de operações no sistema, de compra de assento, ou reserva, ou cancelar reserva. 
    while(escolha != 0){
      //esses dois primeiros System.out.println, é printar a parte superior do ônibus, ou melhor dizendo, a parte superior do retângulo, que representa a parte superior do ônibus.
      System.out.println("   ________________");
      System.out.println("  /----------------\\");
      for (int i = 0 ; i < 10 ; i++){
        for (int j = 0 ; j < 4 ; j++){
          
          //esses ifs, são para que sejam printados uma barra " | " na parte esquerada do ônibus, e que seja printado um barra entre a segunda coluna e a terceira coluna, separando os assentos do lado esquerdo do ônibus, do lado direito do ônibus. O if diz que se a coluna for igual a zero, em outras palavras, se a coluna for a prineira coluna, escreva "|" primeiro. E se a coluna for igual a dois, ou seja, se for a coluna em que separa o lado esquerdo do lado direito do ônibus, escreva uma barra " | ". 
          if (j == 0 || j == 2){
            System.out.print(" | ");
          } else {
            System.out.print(" ");
          }


          //Se a escolha for um, no caso a de venda, ele executa esse primeiro if que está dentro dele
          if (escolha == 1)
          {
            //É importante lembrar que toda vez que o processo recomeça, o vetor pessa por ele mesmo do começo ao final, a importância desse if, é para que apenas o assento que foi especificado pelo usuário seja alterado, sem ele, todos os valores da matriz seriam alterados para zero(0), independente de qual assento foi especificado pelo usuário.
            if (escolhaAssento == assentos [i] [j])
            {
              //O valor do assento especificado pelo usuário é alterado para zero, que é o valor no if posterior, escreverá a letra "V" de Vendido.
              //Essa parte é importante, a opção um (1), que é a opção de compra, não pode ser reversível, uma vez que o assento é vendido, a venda do mesmo não pode ser cancelada, então eu estou transformando o valor que ele tinha(que era o número do assento), em zero, que no System.out.println posterior, escreve a letra "V" ao invés de exibir o número do assento, que foi transformado em 0.
              assentos [i] [j] = 0;
            }
          }else if (escolha == 2){
            //se a escolha for a segunda opção, ele executa o if, para apenas alterar o valor do assento especificado pelo usuário.
            if (escolhaAssento == assentos [i] [j])
            {
              //Essa parte é igualmente importante, diferente da opção de compra, a opção de reserva de assento deve ser reversível, então, ao invés de substituir o valor do assento por zero, o que a opção de reserva faz é substituir o valor do assento por ele mesmo, mas com o sinal invertido. 
              //O motivo disso é porque nos ifs que vão escrever os assentos do ônibus na tela, os números positivos são exibidos no lugar dos assentos, os assentos com valor zero são exibidos com a letra "V" de vendido, e os números negativos são mostrados com a letra "R" de reservado. Agora, como a reserva é cancelada está descrito na opção 3.
              assentos [i] [j] = assentos [i] [j] * -1;
            }
          } else if (escolha == 3){
            //se a escolha for a terceira opção, ele executa o if, para apenas alterar o valor do assento especificado pelo usuário.
            
            //Digamos que o usuário reservou o assento 5, o que o sistema fez, foi alterar o valor na posição da matriz que estava o número 5, e substituiu esse número por ele mesmo, mas com o sinal inverso, então, -5, por ser um número negativo, o sistema escreve a posição dele com um "R" de reservado. 

            //Dito isso, se o usuário escolheu a opção 3, para cancelar a reserva na poltrona 5, o usuário especifica o assento na qual ele quer cancelar a reserva, que no caso seria o assento 5, o if inverteria o sinal do valor do assento especificado pelo usuário, para procurar ele na matriz, lembre-se, na opção de reserva, ele inverte o valor para negativo, então, se foi reservado a poltrona 5, o valor dele não é mais 5, ele foi substituido por -5, para que seja impresso a letra "R" no lugar do valor do assento. Então o if inverte o número especificado pelo usuário, e procura ele na matriz, Quando ele acha, ele faz o que será descrito a seguir. 
            if (escolhaAssento == assentos [i] [j] * -1)
            {
              //Quando ele acha o valor negativo, ele inverte ele denovo, de negativo para positivo, depois disso, quando for chegar nos prints que exibem o ônibus na tela, o valor exibido no lugar do assento não será mais "R", será o número do asseto novamente.
              assentos [i] [j] = assentos [i] [j] * -1;
            }
          }
          
          //Essa parte é mais simples, esses ifs exibem os numeros do assento de fato, se o número for positivo, ele exibe o número do assento, se o número for igual 0, ele exibe a letra "V" e se o número for negativo, ele exite a letra "R".
          if (assentos [i] [j] != 0 && assentos [i] [j] > 0){
            System.out.printf("%3d", assentos [i] [j]);
          } else if (assentos [i] [j] == 0){
            System.out.printf("%3s", "V");
          } else if (assentos [i] [j] < 0){
            System.out.printf("%3s", "R");
          }
        }

        //Esse if é para que seja printado a parte direita do ônibus, ou melhor dizendo a parte direita do retângulo que repreesnta o ônibus.
        System.out.print("|");
        System.out.println();
      }

      //Esse print é para que seja printado a aprte de baixo do ônibus, ou parte de baixo do retângulo que representa o ônibus.
      System.out.println("  ------------------");

      System.out.println();
      System.out.println(" Digite [1] para comprar um assento.");
      System.out.println(" Digite [2] para reservar um assento.");
      System.out.println(" Digite [3] para cancelar a reserva de um assento.");
      System.out.println(" Digite [0] para Fechar o Programa.");
      escolha = sc.nextInt();
      System.out.println();
      System.out.println(" Opcao escolhida: " + escolha);

      //Esse while é para exibir a mensagem de erro, até o usuário esrever um valor válido
      while (escolha < 0 || escolha > 3)
      {
        System.out.println();
        System.out.println(" Opcao invalida digite novamente: ");
        System.out.println();
        System.out.println(" Digite [1] para comprar um assento.");
        System.out.println(" Digite [2] para reservar um assento.");
        System.out.println(" Digite [3] para cancelar a reserva de um assento.");
        escolha = sc.nextInt();
        System.out.println();
        System.out.println(" Opcao escolhida: " + escolha);
      }
      if (escolha != 0){
        System.out.println();
        System.out.println(" Digite que assento deseja que seja realizado a operação: ");
        System.out.println("      Ou digite [0] para voltar a selecao anterior.");
        System.out.println();
        escolhaAssento = sc.nextInt();
        System.out.println();
        System.out.println(" Opcao escolhida: " + escolhaAssento);

        //Esse while é para exibir a mensagem de erro, até o usuário esrever um valor válido
        while (escolhaAssento < 0 || escolhaAssento > 40)
        {
          System.out.println();
          System.out.println(" Opcao invalida digite novamente: ");
          System.out.println();
          System.out.println(" Digite que assento deseja que seja realizado a operação: ");
          System.out.println("      Ou digite [0] para voltar a selecao anterior.");
          System.out.println();
          escolhaAssento = sc.nextInt();
          System.out.println();
          System.out.println(" Opcao escolhida: " + escolhaAssento);
        }
      }
    }
  

  sc.close();

  }
  //Função para limpar o console
  public static void limpaTela() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}