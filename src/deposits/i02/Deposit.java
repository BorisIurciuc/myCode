package deposits.i02;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Deposit {
  private String name;
  private String material;
  private double volumeStart;

  int[] coordinate = new int[4];

  private double extras;

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
    for (int i = 0; i < 4; i++) {
      infoCoordinate.append(coordinate[i]).append("\n");
    }
    return coordinate;
  }

  public double volumeEnd(Status status) {
    switch (status) {
      case DEVELOP:
        return getVolume() - getExtras();
      case PREPARE:
      case CONSERVE:
        return getVolume();
    }
    return 0;
  }
  public void printDeposit(Status status) {
    System.out.println("name: " + getNameDeposit() + ",\nmaterial: " + getMaterial()
        + ",\nvolumeStart: " + getVolume() + ",\nextras: "
        + getExtras() + ",\nvolumeEnd: " + volumeEnd(status));
  }
}
