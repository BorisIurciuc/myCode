package depozits.i02;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Deposit {
  private String name;
  private String material;
  private double volumeStart;
  private double volumeEnd;

  private double extras;


  public Deposit() {
    this.name = " ";
    this.material = "rock";
    this.volumeStart = 0;
    this.extras = 0;
  }

//  public Deposit(double volume) {
//   this.volume = volume;
//
//  }

  public String getNameDeposit() {return name;  }

  public void setNameDeposit(String name) {
    this.name = name;
  }

  public void setMaterial(String material) { this.material = material;  }
  public String getMaterial() { return material; }

  public double getVolume() {
    return volumeStart;
  }

  public void setVolume(double volumeStart) {
    this.volumeStart = volumeStart;
  }

  public void setExtras(double extras) {  this.extras = extras;  }
  public double getExtras() { return extras; }

  public double extrasVolume() {
    return getVolume() - getExtras();
  }

}
