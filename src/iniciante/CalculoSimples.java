package iniciante;

import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //entrada do primeiro produto
        System.out.println("Digite o código da peça: ");
        int codigo1 = entrada.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        int quantidade1 = entrada.nextInt();
        System.out.println("Digite o valor da unidade: ");
        double valorUnidade1 = entrada.nextDouble();

        // entrada do segundo produto
        System.out.println("Digite o código da peça: ");
        int codigo2 = entrada.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        int quantidade2 = entrada.nextInt();
        System.out.println("Digite o valor da unidade: ");
        double valorUnidade2 = entrada.nextDouble();


        double calculoProduto1 = quantidade1 * valorUnidade1;
        double calculoProduto2 = quantidade2 * valorUnidade2;
        double valorTotal = calculoProduto1 + calculoProduto2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);




        entrada.close();
    }

}