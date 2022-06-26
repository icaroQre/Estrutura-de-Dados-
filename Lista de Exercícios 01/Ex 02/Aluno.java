public class Aluno {

    String nome;
    int mediaNotas;
    int v1;
    int v2;
    int v3;

    Aluno(String nome, int v1, int v2, int v3){

        this.nome = nome;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;

    }

    public String calcularMedia(){

        return ("Média: " + (v1 + v2 + v3)/3);

    }

    public String mostrarNotas(){

        return ("Nota 1: " + v1 + " Nota 2: " + v2 + " Nota 3: " + v3);
    }

    public String mostrarNome(){

        return ("Nome: " + nome);

    }


    
}
