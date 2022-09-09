public class ListaDinamica{
    No inicio;
    No fim;

    public void insere(No n){
        if (inicio == null){
            inicio = n;
            fim = n;
        }
        else{
            fim.setProximo(n);
            n.setAnterior(fim);
            fim = n;
        }
    }

    public void imprime(){
        No aux = inicio;
        while (aux!=null){
            System.out.println(aux.toString());
            aux = aux.getProximo();
        }

    }

    public No remover_elemento(String conteudo){

        No aux = inicio;
        No remover = null;
        while(aux!=null){
            if (aux.toString().contains(conteudo)){
                remover = aux;
                break;
            }
            aux = aux.getProximo();
        }

        if (remover == inicio){
            inicio = remover.getProximo();
            if (inicio!=null)
                inicio.setAnterior(null);
            remover.setProximo(null);
            if (remover == fim)
                fim = null;
            return remover;
        }
        else if(remover == fim){
            fim = remover.getAnterior();
            fim.setProximo(null);
            remover.setAnterior(null);
            return remover;
        }
        else if (remover!=null){

            No elAnt = remover.getAnterior();
            No elProx = remover.getProximo();

            elAnt.setProximo(remover.getProximo());
            elProx.setAnterior(remover.getAnterior());
            remover.setProximo(null);
            remover.setAnterior(null);
            return remover;
        }
        else{
 
            return null;
        }
    }
}
