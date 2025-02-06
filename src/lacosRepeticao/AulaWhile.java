package lacosRepeticao;

import java.util.Scanner;

public class AulaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		String opcao="";
		
		while(!opcao.equalsIgnoreCase("sair")) {
			System.out.println("Digite SAIR para sair ou qualquer coisa para continuar");
			opcao = leia.nextLine();
			
			System.out.println("Estamos dentro do While");
			System.out.println("Você digotou: " + opcao );
			System.out.println("-----------------------------------------------");
			
		}
		
		System.out.println("Término do Programa");
	}

}
