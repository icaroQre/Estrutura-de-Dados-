public class Lista {

    private No inicio;
    private No fim;

    public No getInicio() {
        return inicio;
    }
    public void setInicio(No inicio){
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }
    public void setFim(No fim){
        this.fim = fim;
    }
    
    public void insere(No n){
        if (inicio == null){
            inicio = n;
            fim = n;
        }else{
            fim.setNo(n); 
            fim = n;
        }
    }

    public void imprime(){
        No aux =  inicio;
        while (aux != null){
            System.out.println(aux.toString());
            aux = aux.getProximo();
        }
    }
}
