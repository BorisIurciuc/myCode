package extras.t03;

public class Field {

  private String rock;
  Block[] blocks;

  public Field(String rock, double volume, double extract) {
    this.rock = rock;
    this.blocks = new Block[3];

    for (int i = 0; i < 3; i++) {
      this.blocks[i] = new Block((1000 + i * 10), extract);  // Initialize each block with volume 0 and the specified extract value
  }
}

  public String getRock() {
    return rock;
  }

  public void setRock(String rock) {
    this.rock = rock;
  }

  public Block[] getFieldExtract() {
    return blocks;
  }

  double sum = 0;
    public void setFieldExtract(double extract) {
      for( int i = 0;  i< 3; i++)   {
        blocks[i].setExtract(extract);
      }
  }

    public double getSumFieldExtract() {
      double sum = 0;
      for (int i = 0; i < 3; i++) {
        sum += blocks[i].getExtract();
      }
    return sum;
    }

  public void printExtract() {
    System.out.println("Rock: " + getRock() + ", extraction: " + sum);
      for (int i = 0; i < 3; i++) {
        System.out.println("[" + i + "] block, reserve " + blocks[i].getVolume()
            + ", extract " + blocks[i].getExtract() );
        }
  }

}
