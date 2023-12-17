package extras.t01;

public class Field {

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
