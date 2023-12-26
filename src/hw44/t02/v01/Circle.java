package hw44.t02.v01;

public class Circle extends Shape implements Resizable{

  private int radius;

  public Circle() {
  }

  @Override
  public double getPerimeter() {
    return 2 * getRadius() * Math.PI;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public void resize(double coefficient) {
    super.resize(coefficient);
  }

  @Override
  public String toString() {
    return "Circle:   " + " perimeter = " + getPerimeter() + ", radius: " + radius;
  }
}