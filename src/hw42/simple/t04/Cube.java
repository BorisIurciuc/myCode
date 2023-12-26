package hw42.simple.t04;

public class Cube extends Shape implements Datable {
private int side;
  public Cube(String name, int side) {
    super(name);
    this.side = side;
  }
  public int getSide() {
    return side;
  }
  public void setSide(int side) {
    this.side = side;
  }
  @Override
  public String getName() {
    return super.getName();
  }
  @Override
  public void setName(String name) {
    super.setName(name);
  }
  @Override
  public String toString() {
    return super.toString() + " side " + side;
  }


  @Override
  public void give(Datable target, int value) {
    target.take(value);
  }

  @Override
  public void take(int value) {
    side += value;
  }
}
