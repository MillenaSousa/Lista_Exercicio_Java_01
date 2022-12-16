package listaExercicio01;

import java.util.Scanner;

public class Exercicio06Divisao {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor=sc.nextInt();
		System.out.println("Digite o primeiro valor: ");
		int valor1=sc.nextInt();
		int divisao = valor / valor1;
		System.out.println(valor + " / " + valor1 + " = " + divisao );
		sc.close();
	}

}
