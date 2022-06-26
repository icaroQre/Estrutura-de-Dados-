public class Carro {

    String marca;
    String modelo;
    int ano;
    int portas;

    Carro(String marca, String modelo, int ano, int portas){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.portas = portas;

    }

    public String dadosCarro(){

        return ("Marca: " + marca + "\nModelo: " + modelo + "\nAno de fabricação: " + ano + "\nPortas: " + portas + "\n");
    }

}
