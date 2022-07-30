public class No{

    private Atleta atleta;
    private No proximo;

    public No(Atleta atleta){
        this.atleta = atleta;
    }

    public Atleta getAtleta() {
        return atleta;
    }
    public void setAtleta(Atleta atleta){
        this.atleta = atleta;
    }

    public No getProximo() {
        return proximo;
    }
    public void setNo(No proximo){
        this.proximo = proximo;
    }

    public String toString(){

        return atleta.toString();
        
    }
}
