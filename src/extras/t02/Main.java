package extras.t02;

/**
 * 13/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static class Block {

    private double volume;
    public double extract;

    public Block(double volume, double extract) {
      this.volume = volume;
      this.extract = extract;
    }

    public double getVolume() {
      return volume;
    }
    public void setVolume(double volume) {
      this.volume = volume;
    }

    public double getExtract() {
      return extract;
    }
    public void setExtract(double extract) {
      this.extract = extract;
    }
  }
  public static class Field {

    private String rock;
    Block block;

    public Field(String rock, double volume, double extract) {
      this.rock = rock;
      this.block = new Block(volume, extract);
    }
    public String getRock() {
      return rock;
    }
    public void setRock(String rock) {
      this.rock = rock;
    }

    public void setFieldExtract(double extract) {
      block.setExtract(extract);
    }
    public double getFieldExtract(){
      return block.getExtract();
    }
    public void printExtract(){
      System.out.println("Запасы " + block.getVolume() + " getFieldExtract() " + getFieldExtract());
    }
  }

  public static class Mining extends Company {

    private String license;
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

    @Override
    public String toString() {
      return "Mining{" +
          "license='" + license + '\'' +
          ", field=" + field +'}';
    }
  }

  public static class Customer extends Company {
    private String license;
    public Customer(String name, String license) {
      super(name);
      this.license = license;
    }

    @Override
    public String getName() {
      return super.getName();
    }
  }
  public static class Company
  {
    private String name;


    public Company(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

  }
  public static void main(String[] args) {

    Mining mining = new Mining("MiningA", "mining");
    Company customer = new Customer("CustomA", "trade");
    Field field = new Field("sand", 1000, 0);


    field.setFieldExtract(12);
    mining.getMiningExtract();

    mining.toString();
    field.printExtract();
  }
}
