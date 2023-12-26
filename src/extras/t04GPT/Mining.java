package extras.t04GPT;

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
    System.out.println("Company " + getName() + " License " + getLicense()
        + ", Mining extraction: " + getMiningExtract());
  }
}