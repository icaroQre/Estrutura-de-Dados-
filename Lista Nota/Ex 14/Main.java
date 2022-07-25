public class Main{
    public static void main(String[] args) {
        
        ListaCompras listaCompras = new ListaCompras(5);
        No p1 = new No("Maccarrão", 3.50, 2);
        No p2 = new No("Arroz", 28.50, 1);
        No p3 = new No("Leite", 7.50, 7);
        No p4 = new No("Cereal", 5.99, 5);



        listaCompras.insere(p1);
        listaCompras.insere(p2);
        listaCompras.insere(p3);
        listaCompras.insere(p4);

        listaCompras.imprimeLista();

        listaCompras.remove("Arroz");

        listaCompras.imprimeLista();

        listaCompras.calculoTotal();

        listaCompras.limpaLista();

        listaCompras.imprimeLista();

    }
}
