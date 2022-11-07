public class Voiture {
  private int prix;
  private String modele;
  private Pilote pilote;

  public Voiture(int prix, String modele, Pilote pilote) {
    this.prix = prix;
    this.modele = modele;
    this.pilote = pilote;
  }

  public void demarrer() {
    System.out.println("Démarrage...");
  }

  public void arreter() {
    System.out.println("Arrêt.");
  }

  public void deplacer() {
    System.out.println("Vroum.");
  }

  public void conduire(){
    System.out.println(pilote.getNom() + " conduit une voiture " + modele + "...");
  }}
