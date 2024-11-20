package iniciante;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Leitura das três notas com uma casa decimal
        System.out.println("Digite a primeira nota: ");
        double A = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double B = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double C = scanner.nextDouble();

        // Cálculo da média ponderada
        double media = (A * 2 + B * 3 + C * 5) / 10;

        // Exibição da média formatada conforme o exemplo
        System.out.printf("MEDIA = %.1f%n", media);

        // Fechamento do scanner
        scanner.close();
    }
}