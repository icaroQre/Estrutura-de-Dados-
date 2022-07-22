public class Pilha {

    int topo = -1;
    Contato pilha[];

    public Pilha(int tamanho){
        topo = -1;
        pilha = new Contato[tamanho];
    }

    public void empilha(Contato contato){

        if(topo<pilha.length-1){
            topo++;
            pilha[topo] = contato;
            System.out.println("\nContato inserido com sucesso!\n");
        }
        else{
            System.out.println("\nPilha está cheia!\n");
        }

    }
    
    public Contato desempilha(){

        if(topo!=-1){
            Contato last = pilha[topo];
            pilha[topo] = null;
            topo--;
            return last;
        }

        else{
            System.out.println("\nA pilha está vazia!\n");
            return null;
        }
    }

    public void imprimePilha(){

        System.out.println("\n\nExibindo pilha:\n\n");

        for(int i = topo; i >= 0; i--){
            System.out.println(pilha[i].contato());
        }
    }
}
