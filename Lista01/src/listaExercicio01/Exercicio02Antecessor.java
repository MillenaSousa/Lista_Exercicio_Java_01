package listaExercicio01;

import java.util.Scanner;

public class Exercicio02Antecessor {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		int antecessor = valor - 1;
		System.out.println("O antecessor de " + valor + " é " + antecessor);
		sc.close();
	}
	
}
