package depozits.i02;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Deposit {
  private String name;
  private String rock;
  private double volume;

  public Deposit() {
    this.name = " ";
    this.rock = " ";
    this.volume = 0;
  }

  public Deposit(double volume) {
   this.volume = volume;
  }



  public String getNameDeposit() {return name;  }

  public String getRock() {     return rock;   }

  public void setNameDeposit(String name) {
    this.name = name;
  }

  public void setRock(String rock) {   this.rock = rock;   }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }
}