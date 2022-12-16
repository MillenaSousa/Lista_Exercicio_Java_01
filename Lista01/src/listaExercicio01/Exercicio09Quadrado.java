package listaExercicio01;

import java.util.Scanner;

public class Exercicio09Quadrado {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado: ");
		int lado = sc.nextInt();
		
		System.out.println("A area do quadrado é " + lado*2);
		sc.close();
	}
}