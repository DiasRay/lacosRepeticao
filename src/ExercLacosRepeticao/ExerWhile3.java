package ExercLacosRepeticao;

import java.util.Scanner;

public class ExerWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int men21 = 0;
		int mai50 = 0;
		int idade;
		
		System.out.println("Informe as idades que deseja avaliar:"
				+ "\n(Quando quiser encerrar, informe um valor negativo)");
		
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade>0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade > 50) {
				mai50++;
			} else if(idade<21) {
				men21++;
			}
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + men21);
		
		System.out.println("Total de pessoas maiores de 50 anos: " + mai50);
			
	}

}
