package extras.t03;
public class Mining extends Company {

  private final String license;
  private Field field;

  public Mining(String name, String license) {
    super(name);
    this.license = license;
    this.field = new Field("?", 0, 0);
  }

  public String getLicense() {
    return license;
  }

  public double getMiningExtract() {
    return field.getSumFieldExtract();
  }

  public void printMining() {
    System.out.println("License " + getLicense() + ", Mining extraction: " + getMiningExtract());
  }
}