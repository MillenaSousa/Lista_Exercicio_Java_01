package listaExercicio01;

import java.util.Scanner;

public class Exercicio03Soma {
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor = sc.nextInt();
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		int soma = valor + valor1;
		System.out.println(valor + " + " + valor1 + " = " + soma);
		sc.close();
	}
}
