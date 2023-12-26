package extras.t01.diagramm;

/**
 * 13/12/2023 myCode
 *
 * @author Boris Iurciuc (cohort36)
 */
public class Mining extends Company {

  private final String license;
  private Field field;
  public Mining(String name, String license) {
    super(name);
    this.license = license;
    field = new Field("ss", 0, 0);
  }
  public String getLicense() {
    return license;
  }

  public double getMiningExtract(){
    return field.getFieldExtract();
  }

  public void printMining() {
    System.out.println("printMining() " + field.getFieldExtract());
  }

}
