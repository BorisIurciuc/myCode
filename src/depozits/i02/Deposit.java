package depozits.i02;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Deposit {
  private String name;
  private String material;
  private double volume;


  public Deposit() {
    this.name = " ";
    this.material = "rock";
    this.volume = 0;
  }

  public Deposit(double volume) {
   this.volume = volume;

  }

  public String getNameDeposit() {return name;  }

  public void setNameDeposit(String name) {
    this.name = name;
  }

  public void setMaterial(String material) { this.material = material;  }
  public String getMaterial() { return material; }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }
}
