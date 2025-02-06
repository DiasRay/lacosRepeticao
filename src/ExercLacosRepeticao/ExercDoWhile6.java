package ExercLacosRepeticao;

import java.util.Scanner;

public class ExercDoWhile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        float mult3 = 0;
        int qtd3 = 0;
        Scanner leia = new Scanner(System.in);
        
        // Laço de repetição para receber números até que o usuário digite 0
        do {
            System.out.print("Informe um número: ");
            num = leia.nextInt();
            
            if (num % 3 == 0 && num != 0) {  // Verifica se o número é múltiplo de 3 e não é zero
                mult3 += num;
                qtd3++;
            }
            
        } while (num != 0);  // O laço continua até o usuário digitar 0
        
        // Verifica se ao menos um múltiplo de 3 foi inserido
        if (qtd3 > 0) {
            // Calcula e exibe a média
            System.out.printf("A média de todos os múltiplos de 3 é: %.2f", mult3 / qtd3);
        } else {
            // Caso nenhum múltiplo de 3 tenha sido informado
            System.out.println("Nenhum múltiplo de 3 foi informado.");
        }
    }
}