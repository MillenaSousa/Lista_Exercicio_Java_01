package listaExercicio01;

import java.util.Scanner;


public class Exercicio12Circulo {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		
		int raio = sc.nextInt();
		
		double area = Math.pow(raio, 2) * Math.PI;
		
		System.out.println(area);
		sc.close();
	}
}	
