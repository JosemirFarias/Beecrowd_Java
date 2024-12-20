package iniciante;

import java.util.Scanner;

public class TesteSelecao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Recebe valores
		System.out.println("Digite o valores A, B, C e D: ");
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		int C = entrada.nextInt();
		int D = entrada.nextInt();
		
		// Verifica condições
		if(B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores não aceitos");
		}
		
		entrada.close();
		
	}

}
