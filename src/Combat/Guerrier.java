package Combat;
import java.util.Random;


public class Guerrier extends Personnage {
    private int bonusDefense;
    private static final double CHANCE_BONUS_DEFENSE = 0.05;

    // Constructeur
    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    // Getters et Setters
    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    @Override
    public void attaquer(Personnage cible) {
        Random random = new Random();
        boolean coupCritique = random.nextDouble() < CHANCE_BONUS_DEFENSE;

        int degats = this.getAttaque() - cible.getDefense();

        if (degats > 0) {
            cible.setVie(cible.getVie() - degats);
            System.out.println(this.getNom() + " attaque " + cible.getNom() + " et inflige " + degats + " dégâts !");
        } else {
            System.out.println(this.getNom() + " attaque " + cible.getNom() + " mais la défense absorbe tous les dégâts !");
        }

        if (cible.getVie() <= 0) {
            cible.setVie(0);
            System.out.println(cible.getNom() + " est KO !");
        }

        if (coupCritique) {
            this.setVie(this.getVie() + this.bonusDefense);
            System.out.println("🛡️ Coup critique défensif ! " + this.getNom() + " gagne " + this.bonusDefense + " points de vie supplémentaires !");
        }
    }
}
