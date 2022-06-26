//1) Crie um novo projeto de algoritmo em JAVA que contenha somente a classe principal 
//Neste algoritmo, crie um método (função) que realize o calculo da média entre três valores (v1, v2 e v3) imprima o resultado do calculo, assim como o valor de cada um dos valores.
//Exemplo de saída:
//v1: 70 v2: 80 v3: 75 média: 75

public class Principal{

    public int media(int a, int b, int c){

        return ((a + b + c)/3);

    }

    public static void main(String[] args) {

        Principal principal = new Principal();

            int v1 = 70;
            int v2 = 80;
            int v3 = 75;
        
        System.out.println("Os 3 valores são: " + v1 + " " + v2 + " " + v3);
        System.out.println("O resultado da média dos 3 valores é: " + principal.media(v1, v2, v3));
        
    }
    
}
 
