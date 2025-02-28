import Combat.Guerrier;
import Combat.Partie;
import Combat.Personnage;

public class Main {
    public static void main(String[] args) {
        // Création des personnages
        Guerrier guerrier = new Guerrier("Conan", 120, 40, 15, 20);
        Personnage mage = new Personnage("Gandalf", 100, 30, 5);

        // Création et lancement de la partie
        Partie partie = new Partie(guerrier, mage, 1);
        String resultat = partie.lancerPartie();

        // Affichage du résultat final
        System.out.println("Résultat final : " + resultat);
    }
}
