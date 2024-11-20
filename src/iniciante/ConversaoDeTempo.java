package iniciante;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor");
        int N = entrada.nextInt();

        int horas = N / 3600; // 1 hora = 3600 segundos
        int minutos = N % 3600 / 60; // restante dividido por 60
        int segundos = N % 60; // restante dos segundos

        System.out.printf("%d:%d:%2d%n", horas, minutos, segundos);

        entrada.close();

    }
}
