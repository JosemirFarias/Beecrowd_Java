package iniciante;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Peso para cada nota.
        final int P1 = 2;
        final int P2 = 3;
        final int P3 = 4;
        final int P4 = 1;
        final int soma = P1 + P2 + P3 + P4;

        //Entrada do usuário.
        System.out.println("Digite as notas do aluno: ");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();

        //Calculo das notas pelos seus respectivos pesos.
        double p1 = n1 * P1;
        double p2 = n2 * P2;
        double p3 = n3 * P3;
        double p4 = n4 * P4;
        double media = (p1 + p2 + p3 + p4) / soma;
        media = Math.floor(media * 10) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        //Condições.
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em exame.");
            double exame = entrada.nextDouble();
            System.out.println("Nota do exame: " + exame);
            if (exame >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            //Exibe a média final.
            System.out.printf("Media final: %.1f%n", (media + exame) / 2);
        }

        entrada.close();
    }
}
