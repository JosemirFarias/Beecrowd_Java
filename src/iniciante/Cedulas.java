package iniciante;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {

        //solicita um valor inteiro e lê esse valor
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor");
        int N = entrada.nextInt();

        //verifica se o valor está no intervalo correto
        if (N < 0 || N > 1000000) {
            System.out.println("O valor deve estar entre 0 e 1000000.");
            return;
        }

        //exibe o valor
        System.out.println(N);

        //listas com as notas disponíveis
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        // calculando a quantidade de cedulas
        for (int nota : notas) {
            int quantidade = N / nota;

            System.out.printf("%d nota(s) de R$ %d,00%n", quantidade, nota);

            //atualização do valor restante
            N %= nota;
        }

        entrada.close();
    }
}
