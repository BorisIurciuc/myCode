package hw42.simple.t04;
public class Ball extends Shape implements Datable {
  private int rad;
  public Ball(String name, int rad) {
    super(name);
    this.rad = rad;
  }
  public int getRad() {
    return rad;
  }
  public void setRad(int rad) {    this.rad = rad;   }
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
    return super.toString() + " rad " + rad;
  }

  @Override
  public void give(Datable target, int value) {
    target.take(value);
  }
  @Override
  public void take(int value) {
    rad += value;
  }
}
