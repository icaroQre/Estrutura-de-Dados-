
public class Fila {

    int ponteiroInicial;
    int ponteiroFinal;
    Contato fila[];

    public Fila(int tamanho){
        ponteiroInicial = 0;
        ponteiroFinal = -1;
        fila = new Contato[tamanho];
    }

    public void insereFila(Contato contato){

        if(ponteiroFinal<fila.length-1){
                ponteiroFinal++;
                fila[ponteiroFinal] = contato;
                System.out.println("\nInserido com sucesso!\n");
        }
        else{
            System.out.println("\nFila está cheia!\n");
        }

    }

    public Contato removeFila(){
        if(ponteiroFinal!=0){
            Contato start = fila[ponteiroInicial];
            for(int i = ponteiroInicial; i < ponteiroFinal; i++){
                fila[i] = fila[i+1];
            }
            ponteiroFinal--;
            return start;
        }
        else{
            System.out.println("\nFila vazia!\n");
            return null;
        }
    }

    public void imprimeFila(){
        System.out.println("\n\nExibindo fila:\n\n");

        for(int i = 0; i<=ponteiroFinal; i++){
            System.out.println(fila[i].contato());
        }
    }
}
