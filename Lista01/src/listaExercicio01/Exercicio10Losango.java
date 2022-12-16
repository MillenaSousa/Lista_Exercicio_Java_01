package listaExercicio01;

import java.util.Scanner;

public class Exercicio10Losango {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior: ");
		int maior = sc.nextInt();
		
		System.out.println("Digite o valor da diagonal menor: ");
		int menor = sc.nextInt();
		
		int area = (maior * menor) / 2;
		
		System.out.println("A area do losango é " + area);
		sc.close();
	}
}
