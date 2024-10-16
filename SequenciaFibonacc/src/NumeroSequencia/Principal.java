package NumeroSequencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		try (Scanner nome = new Scanner(System.in)) {
			int n = nome.nextInt();
			
			NovaFibo f = new NovaFibo();
			if (f.pertenceFibonacc(n)) {
			    System.out.println("O número " + n + " pertence a sequência de Fibonacci.");
			} else {
			    System.out.println("O número " + n + " não pertence a sequência de Fibonacci.");
			}
		}
		

	}

}
