package ExercLacosRepeticao;

import java.util.Scanner;

public class ExercWhile4 {

    public static void main(String[] args) {
        // Instanciando o Scanner para leitura dos dados
        Scanner leia = new Scanner(System.in);

        // Variáveis de contagem
        int idade, opcGen, areaDev;
        boolean escolha;

        // Contadores para diferentes categorias
        int backend = 0, front = 0, mobil = 0, fullst = 0;
        int mCis = 0, hCis = 0, nBin = 0, mTrans = 0, hTrans = 0, outro = 0;
        int qtd = 0, tIdades = 0;

        // Contadores para filtragens específicas
        int mulheresCisTransFront = 0;
        int homensCisTransMobil40 = 0;
        int nBinFullStackMenor30 = 0;

        // Laço de repetição para a pesquisa
        escolha = true;
        while (escolha) {
            System.out.println("---Pesquisa Interna - Desenvolvimento---");

            qtd++;  // Incrementa o número de pessoas na pesquisa

            // Coletando idade
            System.out.println("Informe a idade: ");
            idade = leia.nextInt();
            tIdades += idade;  // Soma as idades para calcular a média no final

            // Coletando o gênero
            System.out.println("Gênero que se identifica: "
                    + "\n 1 - Mulher Cis"
                    + "\n 2 - Homem Cis"
                    + "\n 3 - Não Binário"
                    + "\n 4 - Mulher Trans"
                    + "\n 5 - Homem Trans"
                    + "\n 6 - Outros");
            opcGen = leia.nextInt();

            switch (opcGen) {
                case 1:
                    mCis++;
                    break;
                case 2:
                    hCis++;
                    break;
                case 3:
                    nBin++;
                    break;
                case 4:
                    mTrans++;
                    break;
                case 5:
                    hTrans++;
                    break;
                case 6:
                    outro++;
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }

            // Coletando área de desenvolvimento
            System.out.println("Área que desenvolve: "
                    + "\n 1 - Backend"
                    + "\n 2 - Frontend"
                    + "\n 3 - Mobile"
                    + "\n 4 - FullStack");
            areaDev = leia.nextInt();

            switch (areaDev) {
                case 1:
                    backend++;
                    break;
                case 2:
                    front++;
                    break;
                case 3:
                    mobil++;
                    break;
                case 4:
                    fullst++;
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }

            // Filtros específicos durante a coleta de dados
            // Mulheres Cis e Trans desenvolvedoras Frontend
            if ((opcGen == 1 || opcGen == 4) && areaDev == 2) {
                mulheresCisTransFront++;
            }

            // Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
            if ((opcGen == 2 || opcGen == 5) && areaDev == 3 && idade > 40) {
                homensCisTransMobil40++;
            }

            // Não Binários desenvolvedores FullStack menores de 30 anos
            if (opcGen == 3 && areaDev == 4 && idade < 30) {
                nBinFullStackMenor30++;
            }

            // Pergunta se o usuário deseja continuar
            System.out.println("Deseja continuar? (S/N)");

            // Limpeza do buffer do Scanner
            leia.nextLine();  // Consumir a quebra de linha deixada pelo nextInt()
            String pesq = leia.nextLine();

            if (!pesq.equalsIgnoreCase("S")) {
                escolha = false;
            }
        }

        // Exibição dos resultados conforme os filtros
        System.out.printf("Total de pessoas desenvolvedoras Backend: %d\n", backend);
        System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", mulheresCisTransFront);
        System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", homensCisTransMobil40);
        System.out.printf("Total de Não Binários desenvolvedores FullStack menores de 30 anos: %d\n", nBinFullStackMenor30);

        // Exibição do número total de pessoas na pesquisa
        System.out.printf("Número total de pessoas que responderam à pesquisa: %d\n", qtd);

        // Cálculo da média de idade
        double mediaIdade = (qtd > 0) ? (double) tIdades / qtd : 0;
        System.out.printf("Média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
    }
}
