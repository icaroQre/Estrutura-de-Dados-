//Crie um projeto em JAVA que contenha duas classes: A classe principal e outra classe chamada de Carro. Na classe principal, você deve instanciar a classe carro e criar pelo menos 3 instâncias de Carros.Os dados a serem armazenados de cada carro serão: 
//- Marca (String);
//- Modelo (String);
//- Ano de Fabricação (int);
//- Número de Portas (int). 

//Ainda na classe Carro, crie um método que retorne os dados do carro. A classe principal deve conter as instâncias de cada carro, assim como imprimir os dados de cada um deles.

//Exemplo de saída:

//Marca: Ford
//Modelo: Fiesta
//Ano de Fabricação: 2019
//Portas: 4

public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Chevrolet","Spin - LT - Aut.", 2014, 4);
        Carro carro2 = new Carro("Fiat","Punto - Tjet - Man.", 2010, 4);
        Carro carro3 = new Carro("Mazda","RX-7 - Coupe - Man.", 1993, 2);

        System.out.println("\n\n\n Dados dos carros na garagem: \n");
    
        System.out.println(carro1.dadosCarro());
        System.out.println(carro2.dadosCarro());
        System.out.println(carro3.dadosCarro());
    }
}
