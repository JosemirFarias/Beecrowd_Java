package iniciante;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Recebendo os valores
		System.out.println("Digite três valores com ponto flutuante: ");
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();
		
		// Calculando o discriminante
		double delta = Math.pow(B, 2) - 4 * A * C;
		
		// Verificando o valor de DELTA
		if (A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = (- B + Math.sqrt(delta)) / (2 * A);
			double r2 = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		
		
		entrada.close();
	}

}
