package iniciante;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de dias: ");
		int D = entrada.nextInt();
		
		int anos = D / 365;
		int diasRestantes = D % 365;
		int meses = diasRestantes / 30;
		int dias = diasRestantes % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		
		entrada.close();
	}

}
