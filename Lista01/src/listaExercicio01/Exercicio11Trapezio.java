package listaExercicio01;

import java.util.Scanner;

public class Exercicio11Trapezio {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior: ");
		
		int maior = sc.nextInt();
		
		
		System.out.println("Digite o valor da base menor: ");
		
		int menor = sc.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		
		int altura = sc.nextInt();
		
		int area = ((maior + menor) * altura) / 2;
		
		System.out.println("A area do trapezio é " + area);
		sc.close();	
	}
}
