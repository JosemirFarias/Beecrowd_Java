package iniciante;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tempo");
        int tempo = (int) entrada.nextInt();
        final int quilometros = 30;

        double minutos = ((double) tempo / quilometros) * 60;

        System.out.printf("%.0f minutos%n", minutos);

        entrada.close();
    }
}
