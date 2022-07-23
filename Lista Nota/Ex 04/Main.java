public class Main {
    public static void main(String[] args) {
        
        int vetor[] = new int [20];
        int vetorInverte[] = new int [20];

        //Preenchendo o vetor
        System.out.println("Vetor original: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i;
            System.out.println(vetor[i]);
        }

        System.out.println("Vetor invertido: ");
        for(int i = 0; i < vetorInverte.length; i++){
            vetorInverte[i] = vetor[(vetor.length-1)-i];
            System.out.println(vetorInverte[i]);
        }
    }
}
