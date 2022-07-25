public class ListaCompras extends ListaEstatica {

    private No lista[];

    public ListaCompras(int tamanho){
        lista = new No[tamanho];
        ultimo =-1;
        primeiro = 0;
    }

    @Override
    public void insere(No produto) {
        if(ultimo<lista.length-1){
            ultimo++;
            lista[ultimo] = produto;
        }
        else{
            System.out.println("\nLista cheia!\n");
        } 
    }

    @Override
    public void limpaLista() {
        for(int i = 0; i <= ultimo; i++){
            lista[i] = null;
        }
        System.out.println("\nLista limpa!");
    }

    @Override
    public int busca(String nome) {
        System.out.println("\nProcurando por: " + nome);

        for(int i = 0; i <= ultimo; i++){
            if (lista[i].getNomeProduto().contains(nome)) {
                System.out.println("\nProduto encontrado na posição: " + (i+1));
                return i;
            }
        }
        System.out.println("\nProduto não encontrado!");
        return -1;
    }

    @Override
    public void remove(String nome){
        int posi = busca(nome);

        if(posi!=-1){
            for(int i =posi; i < ultimo; i++){
                lista[i] = lista[i+1];
            }
            System.out.println("\nIten removido com sucesso! " + nome);
            ultimo--;
        }
        else{
            System.out.println("\nIten não localizado!");
        }
    }

    @Override
    public void imprimeLista() {
        System.out.println("\nImprimindo lista de compras!");

        if(lista[0]==null){
            System.out.println("\nLista está vazia!");
        }
        else{
            for(int i = 0; i <=ultimo;i++){
                System.out.println(i+1 + ": " + lista[i].toString());
            }
        }
    }
    
    public void calculoTotal(){
        System.out.println("\nSomando valor total da compra!");
        double total = 0;
        for(int i = 0; i <= ultimo; i++){
            total = total + (lista[i].getValor() * lista[i].getQuantidade());
        }
        System.out.println("\nValor total da compra: " + total);
    }
}
