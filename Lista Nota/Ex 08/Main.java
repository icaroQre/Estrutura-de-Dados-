public class Main {
    public static void main(String[] args) {

        //criando contas 
        Conta c1 = new Conta();
        Conta c2 = new Conta("Ícaro Queiroz", "7038", 10000);
        Conta c3 = new Conta("Gabriel Gallo", "6666", 10000);
        Conta c4 = new Conta("Jurandir Ferreira", "2020", 10000);
        Conta c5 = new Conta("Silviene Machado", "8526", 10000);
        Conta c6 = new Conta("Claudete Pinto", "1234", 10000);

        //criando lista
        Lista lista = new Lista(5);

        //inserindo contas na lista
        lista.insere(c1);
        lista.insere(c2);
        lista.insere(c3);
        lista.insere(c4);
        lista.insere(c5);
        lista.insere(c6);

        //imprimindo lista
        lista.imprime();

        //buscando contas na lista
        lista.busca("Ícaro Queiroz");
        lista.busca("Silviene Machado");
        lista.busca("Claudete Pinto");

        c2.depositar(10000);
        c4.sacar(10000);
        c5.sacar(20000);

        lista.imprime();

    }
}
