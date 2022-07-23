//Escreva um algoritmo que lê uma matriz M (5,5) e calcule as somas:

//a) da linha 4 de M;
//b) da coluna 2 de M;
//c) da diagonal principal;
//d) da diagonal secundária;
//e) de todos os elementos da matriz;
//f) Escreva estas somas e a matriz;

public class Main {
    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        int somaLinha4 = 0;
        int somaColuna2 = 0;
        int somaDiagonalPrin = 0;
        int somaDiagonalSec = 0;
        int somaGeral = 0;

        //preenchendo a matriz de forma rápida 

        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = 1;
            }
        }

        // Somando linha 4 da matriz 

        for (int i = 0; i < 5; i++){
            somaLinha4 = somaLinha4 + matriz[3][i];
        }

        // Somando coluna 2 da matriz 

        for (int i = 0; i < 5; i++){
            somaColuna2 = somaColuna2 + matriz[i][1];
        }

        // Somando a diagonal principal

        for (int i = 0; i < 5; i++){
            somaDiagonalPrin = somaDiagonalPrin + matriz[i][i];
        }

        // Somando Diagonal secundária 

        for (int i = 0; i < 5; i++){
            somaDiagonalSec = somaDiagonalSec + matriz[i][4-i];
        }

        // Somando toda matriz 

        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                somaGeral = somaGeral + matriz[i][j];
            }
        }   



        System.out.println("Matriz: \n");
        
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println(" ");
        } 

        System.out.println("Soma linha 4: " + somaLinha4);
        System.out.println("Soma coluna 2: " + somaColuna2);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrin);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSec);
        System.out.println("Soma de toda a matriz: " + somaGeral);
    }
}
