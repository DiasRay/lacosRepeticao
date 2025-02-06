package ExercLacosRepeticao;

import java.util.Scanner;

public class ExercFor2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int impar =0;
		int par=0;
		
		for(int i=1; i<=10; i++) {
			System.out.printf("Informe o %dº número: ", i);
			int num = leia.nextInt();
			
			if(num%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("-----------------------------------------");
		System.out.printf("\nTotal de números pares: %d", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);
	}
}
