package deposits.i03;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Deposit {
  private String name;
  private String material;
  private double volumeStart;
  int[] coordinate = new int[2];
  private double extras;
  private String status;



  public Deposit() {}

  public Deposit(String name, String material, double volumeStart, int[] coordinate,double extras,
      String status) {
    this.name = name;
    this.material = material;
    this.volumeStart = volumeStart;
    this.coordinate = coordinate;
    this.extras = extras;
    this.status = status;
  }
  public void setNameDeposit(String name) {   this.name = name; }
  public String getNameDeposit() {   return name; }

  public void setMaterial(String material) { this.material = material;  }
  public String getMaterial() { return material; }

  public void setVolume(double volumeStart) {
    this.volumeStart = volumeStart;
  }
  public double getVolume() {
    return volumeStart;
  }
  public void setExtras(double extras) {  this.extras = extras;  }
  public double getExtras() { return extras; }

  public void setCoordinate(int[] coordinate) {
    this.coordinate = coordinate;
  }
  public int[] getCoordinate() {
    StringBuilder infoCoordinate;
    infoCoordinate = new StringBuilder();
    for (int i = 0; i < 2; i++) {
      infoCoordinate.append(coordinate[i]).append("\n");
    }
    return coordinate;
  }
  public void setStatus(String status) {    this.status = status;  }
  public String getStatus() {  return status;  }

  public double volumeEnd() {
    switch (getStatus()) {
      case "develop":
        return getVolume() - getExtras();
      case "prepare":
      case "conserve":
        return getVolume();
    }
    return getVolume();
  }

  public void printDeposit() {
    System.out.print("name: " + getNameDeposit() + ",\nmaterial: " + getMaterial()
        + ",\nvolumeStart: " + getVolume() + ",\nextras: "
        + getExtras() + ",\nvolumeEnd: " + volumeEnd() + "\nstatus: " + getStatus());
    System.out.println();
  }
}

