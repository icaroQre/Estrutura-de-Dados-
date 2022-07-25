public class No {

    private String nomeProduto;
    private Double valor;
    private int quantidade;

    public No(String nomeProduto, Double valor, int quantidade){
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String toString(){
        return this.nomeProduto + " Valor: " + this.valor + " Quantidade: " + this.quantidade;
    }
}
