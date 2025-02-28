package Combat;

public class Personnage {

    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    public Personnage(){}

    public Personnage(String nom, int vie, int attaque, int defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    /*
     * Getters et Setters
     * */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Personnage(String nom, Integer vie, Integer attaque, Integer defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    public void attaquer(Personnage personnage){
        int degats = this.getAttaque() - personnage.getDefense();
        if (degats > 0) {
            personnage.setVie(personnage.getVie() - degats); // Réduction de la vie de la cible
            System.out.println(this.nom + " attaque " + personnage.getNom() + " et inflige " + degats + " dégâts !");
        } else {
            System.out.println(this.nom + " attaque " + personnage.getNom() + " mais la défense absorbe tous les dégâts !");
        }

    }

}
