public class ListaContato {

    int ponteiroFinal = -1;

    Contato listaContato[] = new Contato[5];

    public void inserir(Contato contato){
        if (ponteiroFinal < listaContato.length){
            ponteiroFinal++;
            listaContato[ponteiroFinal] = contato;
          }
        else {
            System.out.println("Lista cheia");
          }
    }

    public void imprimir(){
        
        for(int i = 0; i <= ponteiroFinal; i++){
            System.out.println(listaContato[i].contato());
        }
    }

    public int busca(String contato){

        System.out.println("Buscando por " + contato);

        for(int i=0; i < ponteiroFinal; i++){
            if (listaContato[i].nome.contains(contato)){
                return i;
            }
        }

        System.out.println("Contato não encontrado na lista");
        return -1;
    }

    public void remove(String contato){

        System.out.println("Removendo contato: " + contato);

        int posicao = busca(contato);

        if (posicao != -1){
            for(int i = posicao; i<ponteiroFinal; i++){
                listaContato[i] = listaContato[i+1];
            }
            ponteiroFinal--;
            System.out.println("Contato removido com sucesso!");
        }

        else {
            System.out.println("Falha ao remover");
        }
    }
}
