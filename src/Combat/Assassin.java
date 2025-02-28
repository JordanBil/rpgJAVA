package Combat;

import java.util.Random;

public class Assassin extends Personnage {

    private static final int BONUS_ATTAQUE = 10; // Bonus en cas de coup critique
    private static final double CHANCE_CRITIQUE = 0.05;

    //Constructor
    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
    }

    @Override
    public void attaquer(Personnage cible) {

        Random random = new Random();
        boolean coupCritique = random.nextDouble() < CHANCE_CRITIQUE;

        int degats = this.getAttaque() - cible.getDefense();

        if (coupCritique) {
            degats += BONUS_ATTAQUE;
            System.out.println("🔥 COUP CRITIQUE ! " + this.getNom() + " inflige un coup dévastateur !");
        }

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


    }
}
