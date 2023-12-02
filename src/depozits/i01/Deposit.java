package depozits.i01;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Deposit {
  private String nameDeposit;
  private String nameRock;
  private double volume;
  private double extraction;

  public Deposit() {}

  public String getNameDeposit() {return nameDeposit;  }
  public String getNameRock() { return nameRock;  }
  public double getVolume(){
    return volume;
  }

  public double getExtraction() {
    return extraction;
  }

  public void setNameDeposit(String nameDeposit) {
    this.nameDeposit = nameDeposit;
  }

  public void setNameRock(String nameRock) {
    this.nameRock = nameRock;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  public void setExtraction(double extraction) {
    if (extraction > 0) {
      this.extraction = extraction;
    } else {
      System.out.println("Ошибка, добыча >= 0");
    }
  }
  public void print() {
    System.out.println(getNameDeposit() + ", " + getNameRock() +
        ", " + getVolume() + " m3");
 }

  public void extract(Status status) {
    switch (status) {
      case DEVELOP:
        volume = volume - getExtraction();
        System.out.println("Extraction : " + getExtraction()
            + " Volume " + volume +" m3");
        break;
      case PREPARE:
        System.out.println("Extraction = 0, depozit prepare ");
        break;
      case CONSERVE:
        System.out.println("Extraction = 0, depozit conserv ");
        break;
    }
  }
}
