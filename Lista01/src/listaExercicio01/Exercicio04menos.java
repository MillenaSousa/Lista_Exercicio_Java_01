package listaExercicio01;

import java.util.Scanner;

public class Exercicio04menos {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor=sc.nextInt();
		System.out.println("Digite o primeiro valor: ");
		int valor1=sc.nextInt();
		int subtracao = valor - valor1;
		System.out.println(valor + " - " + valor1 + " = " + subtracao);
		sc.close();		
	}
}
