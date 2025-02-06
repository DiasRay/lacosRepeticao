package ExercLacosRepeticao;

import java.util.Scanner;

public class ExercDoWhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma=0;
		Scanner leia = new Scanner(System.in);
		
		int numDo;
		do {
			System.out.print("Digite um número: ");
			numDo = leia.nextInt();
			
			if(numDo> 0) {
				soma += numDo;
			}
						
		} while (numDo != 0);
		
		System.out.println("\n\nA soma dos números positivos é: " + soma);
	}

}
