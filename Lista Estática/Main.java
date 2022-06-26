//Lista estática.
//Trabalhando com inserção, busca e remoção de elementos de um vetor.

public class Main {
    public static void main(String[] args) throws Exception {

        ListaContato lista = new ListaContato();
        
        Contato c1 = new Contato("Ícaro", "43 99969-4177");
        lista.inserir(c1);
        Contato c2 = new Contato("Gallo", "43 99856-2354");
        lista.inserir(c2);
        Contato c3 = new Contato("Leonardo", "43 99547-1298");
        lista.inserir(c3);
        Contato c4 = new Contato("Lucas", "41 98856-4577");
        lista.inserir(c4);
        Contato c5 = new Contato("João", "42 99987-9993");
        lista.inserir(c5);

        lista.imprimir();

        System.out.println(lista.busca("Lucas"));
        System.out.println(lista.busca("Ícaro"));
        System.out.println(lista.busca("Cleber"));

        lista.remove("Ícaro");
        lista.remove("Gallo");
        lista.remove("Cleber");

        lista.imprimir();



    }
}

