package listaExercicio01;

import java.util.Scanner;

public class Exercicio08Triangulo {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o valor da altura: ");
		int altura = sc.nextInt();
		
		int area = (base*altura) / 2;
		
		System.out.println("A area do triangulo é " + area);
		sc.close();
	}
	

}
