//Implemente um algoritmo em JAVA que possua uma classe Principal e uma classe Aluno. A classe aluno deve ser capaz de armazenar os seguintes dados dos alunos: nome, médiaNotas.
//O método principal (main()) deverá ser implementado dentro da classe Principal.java. 
//Crie 5 instâncias do objeto aluno dentro do método principal e atribua valores para o nome e a média de notas do aluno. 
//Receba dos dados do teclado a informação para preenchimento de 2 alunos (pelo menos). 
//Imprima os dados de cada um dos alunos.

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        Aluno aluno1 = new Aluno("João", 70, 80, 75);
        Aluno aluno2 = new Aluno("Lucas", 60, 80, 90);
        Aluno aluno3 = new Aluno("Luiza", 90, 100, 95);

        Aluno aluno4 = new Aluno(null, 0, 0, 0);
        System.out.println("Digite o nome do aluno 4: ");
        aluno4.nome = input.next();
        System.out.println("Digite as notas do aluno 4: \n (Uma de cada vez)");
        aluno4.v1 = input.nextInt();
        aluno4.v2 = input.nextInt();
        aluno4.v3 = input.nextInt();

        Aluno aluno5 = new Aluno(null, 0, 0, 0);
        System.out.println("Digite o nome do aluno 5: ");
        aluno5.nome = input.next();
        System.out.println("Digite as notas do aluno 5: \n (Uma de cada vez)");
        aluno5.v1 = input.nextInt();
        aluno5.v2 = input.nextInt();
        aluno5.v3 = input.nextInt();

        input.close();

        System.out.println("\n\n\n Informações dos alunos: \n");

        System.out.println(aluno1.mostrarNome());
        System.out.println(aluno1.mostrarNotas());
        System.out.println(aluno1.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno2.mostrarNome());
        System.out.println(aluno2.mostrarNotas());
        System.out.println(aluno2.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno3.mostrarNome());
        System.out.println(aluno3.mostrarNotas());
        System.out.println(aluno3.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno4.mostrarNome());
        System.out.println(aluno4.mostrarNotas());
        System.out.println(aluno4.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno5.mostrarNome());
        System.out.println(aluno5.mostrarNotas());
        System.out.println(aluno5.calcularMedia());

    }
}
