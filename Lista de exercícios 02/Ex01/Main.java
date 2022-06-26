//Escrever um algoritmo que lê um vetor N (20) e que imprima os valores de N. Troque, a seguir, o 1o elemento com o último, o 2o com o penúltimo etc. 
//até o 10o com o 11o e escreva o vetor N assim modificado.
public class Main {
    public static void main(String[] args) {
        
        int n[] = new int[20];
        int nInvertido[] = new int[20];

        System.out.println("Vetor original: ");
        for(int i = 0; i < 20; i++){
            n[i] = i;
            System.out.println(n[i]);
        }

        System.out.println("Vetor invertido: ");
        for(int i = 0; i < 20; i++){
            nInvertido[i] = n[19-i];
            System.out.println(nInvertido[i]);
        }
    }
}
