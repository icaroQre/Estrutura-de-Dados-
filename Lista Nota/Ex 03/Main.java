public class Main {
    public static void main(String[] args) {
        
        int vetor[] = new int [5];
        int vetorClone[] = new int [5];

        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 2;
        vetor[3] = 3;
        vetor[4] = 4;

        System.out.println("Vetor original: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("Vetor clone: ");
        for(int i = 0; i < vetorClone.length; i++){
            vetorClone[i] = vetor[i];
            System.out.println(vetorClone[i]);
        }
    }
}
