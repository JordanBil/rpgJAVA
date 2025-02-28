import Combat.Assassin;
import Combat.Guerrier;
import Combat.Partie;
import Combat.Personnage;

public class Main {
    public static void main(String[] args) {

        Guerrier guerrier = new Guerrier("Conan", 120, 40, 15, 20);
        Assassin assassin = new Assassin("Rogue", 70, 60, 5, 20);

        Partie partie = new Partie(guerrier, assassin, 1);
        String resultat = partie.lancerPartie();

    }
}
