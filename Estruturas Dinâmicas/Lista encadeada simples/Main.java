public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
     
        Atleta a1 = new Atleta("Bruno", 1.78, 69.30, "Esgrima", "Red Bull, Puma, Pic Pay");
        Atleta a2 = new Atleta("Giovanna", 1.60, 52.8, "Vôlei", "Nike, Bayer, Nubank");
        Atleta a3 = new Atleta("Felipe", 1.75, 65.50, "MMA", "Monster, Nike, Neo Química, Bradesco");

        lista.insere(new No(a1));
        lista.insere(new No(a2));
        lista.insere(new No(a3));

        lista.imprime();

    }
}
