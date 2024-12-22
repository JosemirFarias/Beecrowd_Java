package iniciante;

import java.util.Scanner;

public class Lanche {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Exibe o menu
		System.out.println("Código   Especificação        Preço\n");
        System.out.println("1        Cachorro Quente      R$ 4.00");
        System.out.println("2        X-Salada             R$ 4.50");
        System.out.println("3        X-Bacon              R$ 5.00");
        System.out.println("4        Torrada Simples      R$ 2.00");
        System.out.println("5        Refrigerante         R$ 1.50\n");
        
        System.out.println("Digite o código e a quantidade: ");
        int codigo = entrada.nextInt();
        int quantidade = entrada.nextInt();
        
        double preco = 0;
        switch (codigo) {
        
        case 1:
        	preco = 4.00;
        	break;
        case 2:
        	preco = 4.50;
        	break;
        case 3:
        	preco = 5.00;
        	break;
        case 4:
        	preco = 2.00;
        	break;
        case 5:
        	preco = 1.50;
        	break;
        default:
        	System.out.println("Código inválido");
        	//return;
        }
        
        double total = preco * quantidade;
        System.out.printf("Total: R$ %.2f%n", total);
		
		entrada.close();
	}

}
