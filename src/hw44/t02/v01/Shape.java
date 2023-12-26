package hw44.t02.v01;

public abstract class Shape implements Resizable{

  protected double perimeter;

  public Shape() {

  }

  public Shape(double perimeter) {
    this.perimeter = perimeter;
  }

  public abstract double getPerimeter();

  @Override
  public void resize(double coefficient) {

  }

  @Override
  public String toString() {
    return "Shape: " + "perimeter = " + perimeter;
  }


}
