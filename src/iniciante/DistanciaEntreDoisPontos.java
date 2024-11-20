package iniciante;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Leitura dos valores da primeira line
        double X1 = entrada.nextDouble();
        double Y1 = entrada.nextDouble();

        //Leitura dos valores da segunda linha
        double X2 = entrada.nextDouble();
        double Y2 = entrada.nextDouble();

        double X = Math.pow(X2 - X1, 2);
        double Y = Math.pow(Y2 - Y1, 2);
        double soma = X + Y;
        double resultado = Math.sqrt(soma);

        System.out.printf("%.4f%n", resultado);

        entrada.close();
    }
}
