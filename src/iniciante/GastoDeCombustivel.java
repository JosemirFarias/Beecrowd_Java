package iniciante;

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        final double CONSUMO_CARRO = 12;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem");
        double tempo = entrada.nextDouble();
        System.out.println("Digite a velocidade média");
        double velocidade = entrada.nextDouble();

        double litros = (tempo * velocidade) / CONSUMO_CARRO;

        System.out.printf("%.3f%n", litros);

        entrada.close();
    }
}
