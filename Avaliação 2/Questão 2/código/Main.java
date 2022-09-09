class Main {
    public static void main(String[] args) {

        ListaDinamica lista = new ListaDinamica();

        Pessoa p1 = new Pessoa("Mario","Encanador");
        Pessoa p2 = new Pessoa("Carlos","Arquiteto");
        Pessoa p3 = new Pessoa("Joana","Dentista");
        Pessoa p4 = new Pessoa("Lucia","Personal");
        Pessoa p5 = new Pessoa("Julio","Engenheiro");
        Pessoa p6 = new Pessoa("Anthony","Biologo");


        lista.insere(new No(p1));
        lista.insere(new No(p2));
        lista.insere(new No(p3));

        lista.imprime();

        System.out.println("Ponteiro Inicio: "+lista.inicio.hashCode());
        System.out.println("Ponteiro Fim: "+lista.fim.hashCode());

        lista.remover_elemento("Anthony");
        System.out.println("Removeu - Anthony");
        lista.imprime();

        System.out.println("INSERINDO NOVOS VALORES NA LISTA");
        lista.insere(new No(p4));
        lista.insere(new No(p5));
        lista.insere(new No(p6));
        lista.imprime();


        lista.remover_elemento("Lucia");
        System.out.println("Removeu - Lucia");
        lista.remover_elemento("Carlos");
        System.out.println("Removeu - Carlos");
        lista.remover_elemento("Julio");
        System.out.println("Removeu - Julio");
        lista.imprime();
    }
}
