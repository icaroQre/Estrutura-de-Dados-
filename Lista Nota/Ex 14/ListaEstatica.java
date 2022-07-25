public abstract class ListaEstatica{

    public int primeiro;
    public int ultimo;

    public abstract void insere(No produto);
    public abstract void limpaLista();
    public abstract int busca(String nome);
    public abstract void remove(String nome);
    public abstract void imprimeLista();

} 
