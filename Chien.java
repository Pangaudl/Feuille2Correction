public class Chien{
  private String race, couleur;
  private int age;
  /**
    Constructeur de la classe chien.
    @author philr
    @date 07/11/2022

    @param race
      La race du Chien.

    @param age
      L'âge du Chien.

    @param couleur
      La couleur du Chien.

    @return Un nouveau Chien.
  */
  public Chien(String race, int age, String couleur){
    this.race = race;
    this.age = age;
    this.couleur = couleur;
  }

  public void aboyer(){
    System.out.println("Ouaf ouaf.");
  }

  public void dormir(){
    System.out.println("Zzzzzzzzzzzzz...");
  }
  
}