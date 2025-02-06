package ExercLacosRepeticao;

import java.util.Scanner;

public class ExercFor1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.print("\nInforme o 1º número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.print("\nInforme o 2º número do intervalo: ");
		num2 = leia.nextInt();
		
		
		if(num1 < num2) {
			
			System.out.println("\n----------------------------------------------------------------------\nNo intervalo entre " + num1 + " e " + num2 + ": ");

			for(int i = num1; i<=num2;i++) {
				
				if(i%3 == 0 && i%5==0) {
					System.out.printf("\n%d é multiplo de 3 e 5", i);
				}
				
			}
		} else {
			System.out.println("\nIntervalo inválido!!");
		}
	}
}
