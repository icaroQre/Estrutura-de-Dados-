//Escrever um algoritmo que lê um vetor G (13) que é o gabarito de um teste de loteria esportiva, contendo os valores 1 (coluna 1) ou 2 (coluna 2) ou 3 (coluna do meio).
//Ler, a seguir, para cada apostador, o número de seu cartão e um vetor Resposta R (13). Verificar para cada apostador o número de acertos e escrever o número do apostador e seu número de acertos. 
//Se tiver 13 acertos, acrescentar a mensagem: "GANHADOR, PARABENS".


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gabarito[] = new int[13];
        int resposta[] = new int[13];
        int cartao;
        int pontos = 0;

        // Lê o gabarito e verifica se o valor é valido

        System.out.println("Digite o gabarito da loteria esportiva: ");

        for (int i = 0; i < 13; i++){
            gabarito[i] = input.nextInt();
            
            if (gabarito[i] < 1 || gabarito[i] > 3){
                System.out.println("Valor inválido");
                return;
            }
        }

        // Lê o número do cartão e as respotas verificando se o valor é valido 

        System.out.println("\nDigite o número do cartão do apostador: \n");
        cartao = input.nextInt();

        System.out.println("\nDigite as respostas do cartão do jogador " + cartao + " :\n");

        for (int i = 0; i < 13; i++){
            resposta[i] = input.nextInt();
            
            if (resposta[i] < 1 || resposta[i] > 3){
                System.out.println("Valor inválido");
                return;
            }
        }

        input.close();

        // Compara as respostas com o gabarito

        for(int i = 0; i < 13; i++){

            if (resposta[i] == gabarito[i]){
                pontos++;
            }
        }
        
        // Mostra a quantidade de pontos 
        System.out.println("Jogador com o número de cartão " + cartao + " acertou " + pontos + " pontos");
        if (pontos == 13){
            System.out.println("\nGANHADOR, PARABÉNS\n");
        }
    }
}
