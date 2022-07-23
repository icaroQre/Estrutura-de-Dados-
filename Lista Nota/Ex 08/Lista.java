public class Lista {

    private Conta lista[];
    private int ponteiroFinal;
    
    Lista(int tamanho){
        lista = new Conta[tamanho];
        ponteiroFinal = -1;
    }

    public void imprime(){
        for(int i = 0; i <= ponteiroFinal; i++){
            System.out.println("\nConta número: " + i);
            System.out.println("Nome: " + lista[i].getNomeTitular());
            System.out.println("Número: " + lista[i].getNumeroConta());
            System.out.println("Saldo: " + lista[i].getSaldoConta());
            System.out.println("\n\n");
        }
    }

    public void insere(Conta conta){
        if(ponteiroFinal<lista.length-1){
            ponteiroFinal++;
            lista[ponteiroFinal] = conta;
            System.out.println("\nConta inserida com sucesso!\n"); 
        }
        else{
            System.out.println("\nA lista esta cheia!\n");
        }
    }

    public void busca(String nome){
        System.out.println("\nBuscando por: "+ nome);
        for(int i =0; i<=ponteiroFinal;i++){
            if(lista[i].getNomeTitular().contains(nome)){
                System.out.println("\nConta encontrada na posição: " + i);
                return;
            }
        }
        System.out.println("\nConta não encontrada!\n");
        return;
    }
}
