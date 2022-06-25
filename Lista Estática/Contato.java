public class Contato {
    
    String nome;
    String numero;

    Contato(String nome, String numero){

        this.nome = nome;
        this.numero = numero;
    }

    public String contato(){
        return "Nome: " + nome + " / " + " Número: " + numero;
    }
}
