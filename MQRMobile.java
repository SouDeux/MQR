/*
 desafio do bruno para ele mesmo:
 crie um programa para girar dados bem completinho, boa sorte :D
*/

import java.util.Random;
import java.util.Scanner;

public class MQR {

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    boolean jogardnv;


        System.out.println("-------------------------------------------------------------------");
        System.out.println("             Bem vindo ao MQR (Melhor Que o Rollem)!              ");
        System.out.println("-------------------------------------------------------------------");

    do {
        boolean mult;
        int qntdados = 1;
        int valor;
        int soma = 0;
        double media;

        // inicio
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                            Boa sorte! :)                         ");
        System.out.println("-------------------------------------------------------------------");


        // checa se o usuário irá jogar multiplos dados, estando dentro de um loop para o caso de ele digitar errado:
        while (true){
            System.out.print("  Pretende jogar mais de um dado? (s/n): ");
            String skii = s.next();
            if (skii.equalsIgnoreCase("n")){
                mult = false;
                break;
            }
            else if (skii.equalsIgnoreCase("s")){
                mult = true;
                break;
            }
            else{
                System.out.println("  Apenas s ou n! ");
            }
        }


        // checa a quantidade de dados desejados
        if (mult) {
            System.out.print("  Digite a quantidade de dados que deseja: ");
            qntdados = s.nextInt();
            if (qntdados <= 1) {  // checa se o jogador vai jogar um único dado, transformando mult em false
                System.out.println("  Nesse caso, será somente um dado.");
                mult = false;
            }
        }




        // checa a quantidade de lados e joga os dados, estando dentro de um loop para caso o jogador digite um número estranho de lados
        while (true){
            System.out.print("  Digite a quantidade de lados que deseja: ");
            int lados = s.nextInt(); // pega a quantidade de lados do(s) dado(s)
            if (lados > 1) {  // checa se tem mais de 0 lados
                    System.out.println("-------------------------------------------------------------------");
                    System.out.print("                             Resultado");
                    if (mult){
                        System.out.println("s!!!                               ");
                    }
                    else{
                        System.out.println("!!!                                ");
                    }
                    System.out.println("-------------------------------------------------------------------");

                if (mult){
                    System.out.print("  Os valores sorteados foram: ");
                }
                else{
                    System.out.print("  O valor sorteado foi: ");
                }

                for (int iter = 0; iter < qntdados; iter++){
                    valor = r.nextInt(lados) + 1;
                    System.out.print(valor);
		    if (iter < qntdados - 1) {
      			System.out.print(", ");
  		    }
                    soma += valor;
                }

                double maximo = lados * qntdados;
                media = soma / maximo;
                if (mult){
                    System.out.print("\n\n —— Soma: " + soma + "\n\n —— Média: " + ( (double)soma / qntdados) + ". \n\n —— ");
                }


                if (media <= 1. / 6 || soma == 1) {
                    System.out.println("  Que paia, é pra ser... :'(");
                } else if (media <= 2. / 6) {
                    System.out.println("  Não é um dado bom.");
                } else if (media < 3. / 6) {
                    System.out.println("  Podia ser pior, né?");
                } else if (media == 3. / 6) {
                    System.out.println("  Tá na média ¯\\_(ツ)_/¯");
                } else if (media <= 4. / 6) {
                    System.out.println("  Que bom!");
                } else if (media < 6. / 6) {
                    System.out.println("  VAMOOOO!");
                } else if (media / qntdados == 1) {
                    System.out.println("  É pra ser :D");
                } else {
                    System.out.println("  ???");
                }
                break;

            }
            else if (lados == 1){
                System.out.println("  sempre vai cair 1, né? ¯\\_(ツ)_/¯");
            }
            else{
                System.out.println("  não pode ser menor que 1.");
            }
        }



        // pra checar se o jogador vai jogar dnv

        while (true){
            System.out.print("  deseja jogar novamente? (s/n): ");
            String m = s.next();
            if (m.equalsIgnoreCase("n")){
                System.out.println("  obrigado por jogar, volte sempre!");
                jogardnv = false;
                break;
            }
            else if (m.equalsIgnoreCase("s")){
                jogardnv = true;
                break;
            }
            else{
                System.out.println("  apenas s ou n!");
            }
        }



    } while (jogardnv);
    s.close();
    }
}

// tempo total: 2 dias (precisei dormir no meio)
// o tutorial utilizado foi: https://www.youtube.com/watch?v=xTtL8E4LzTQ
// meu primeiro codigo legal, tou feliz 👍