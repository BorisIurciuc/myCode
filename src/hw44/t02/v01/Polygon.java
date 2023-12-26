package hw44.t02.v01;

public class Polygon extends Shape implements Resizable{

  private int sideLength;
  private int amountSide;

  public Polygon() {
  }
  @Override
  public double getPerimeter() {
    return getSideLength() * getAmountSide();
  }

  public int getSideLength() {
    return sideLength;
  }

  public void setSideLength(int sideLength) {
    this.sideLength = sideLength;
  }

  public int getAmountSide() {
    return amountSide;
  }

  public void setAmountSide(int amountSide) {
    this.amountSide = amountSide;
  }

  @Override
  public void resize(double coefficient) {
    super.resize(coefficient);
  }

  @Override
  public String toString() {
    return "Polygon:  " + " perimeter: " + getPerimeter() + ", sideLength: " + sideLength +
        ", amountSide: " + amountSide;
  }
}
