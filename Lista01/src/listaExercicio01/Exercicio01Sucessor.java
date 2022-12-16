package listaExercicio01;

import java.util.Scanner;

public class Exercicio01Sucessor {

	public static void main(String[]args) {
		
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		int sucessor = valor + 1;
		System.out.println("O sucessor de " + valor + " � " + sucessor);
		sc.close();
	}
}
