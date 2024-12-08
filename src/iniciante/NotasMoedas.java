package iniciante;

import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Digite um valor");
    	double valor = entrada.nextDouble();
    	
    	// Converter o valor em centavos
    	int valorEmCentavos = (int) Math.round(valor * 100);
    	
    	//Arrays com valores de notas e moedas (em centavos)
    	int[] notas = {10000, 5000, 2000, 1000, 500, 200};
    	int[] moedas = {100, 50, 25, 10, 5, 1};
    	
    	//Calculando a quantidade de notas
    	System.out.println("NOTAS:");
    	for (int nota: notas) {
    		int quantidadedeNotas = valorEmCentavos / nota;
    		System.out.printf("%d nota(s) de R$ %.2f%n", + quantidadedeNotas, nota / 100.0);
    		valorEmCentavos %= nota;
    	}
    	
    	//Calculando as moedas
    	System.out.println("MOEDAS:");
    	for (int moeda: moedas) {
    		int quantidadedeMoedas = valorEmCentavos / moeda;
    		System.out.printf("%d moeda(s) de R$ %.2f%n", + quantidadedeMoedas, moeda / 100.0);
    		valorEmCentavos %= moeda;
    	}
    
    	entrada.close();
        
    }
}
