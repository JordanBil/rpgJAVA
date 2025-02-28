package Combat;

public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    // Constructeur
    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    // Getters et Setters
    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    //METHODES
    public String lancerPartie() {
        System.out.println("Début de la partie entre " + joueur1.getNom() + " et " + joueur2.getNom() + " !");

        while (nbrTour > 0) {
            System.out.println("--- Tour " + (nbrTour) + " ---");

            joueur1.attaquer(joueur2);
            if (joueur2.getVie() <= 0) {
                System.out.println("🏆 " + joueur1.getNom() + " remporte la partie !");
                return joueur1.getNom() + " gagne !";
            }

            joueur2.attaquer(joueur1);
            if (joueur1.getVie() <= 0) {
                System.out.println("🏆 " + joueur2.getNom() + " remporte la partie !");
                return joueur2.getNom() + " gagne !";
            }

            nbrTour++;
        }

        // Fin de la partie
        if (joueur1.getVie() > 0 && joueur2.getVie() > 0) {
            System.out.println("🤝 Match nul !");
            return "Égalité !";
        } else if (joueur1.getVie() <= 0) {
            System.out.println("\n🏆 " + joueur2.getNom() + " remporte la partie !");
            return joueur2.getNom() + " gagne !";
        } else {
            System.out.println("\n🏆 " + joueur1.getNom() + " remporte la partie !");
            return joueur1.getNom() + " gagne !";
        }
    }
}
