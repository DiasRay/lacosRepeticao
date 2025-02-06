package ExercLacosRepeticao;

import java.util.Scanner;

public class ExercDoWhile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        float mult3 = 0;
        int qtd3 = 0;
        Scanner leia = new Scanner(System.in);
        
        do {
            System.out.print("Informe um número: ");
            num = leia.nextInt();
            
            if (num % 3 == 0 && num != 0) { 
                mult3 += num;
                qtd3++;
            }
            
        } while (num != 0);  
        
        if (qtd3 > 0) {
            System.out.printf("A média de todos os múltiplos de 3 é: %.2f", mult3 / qtd3);
        } else {
            System.out.println("Nenhum múltiplo de 3 foi informado.");
        }
    }
}