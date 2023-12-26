package hw44.t02.v01;

public class Rectangle extends Shape implements Resizable{

  private int sideA;
  private int sideB;
  double coefficient;

  public Rectangle() {
  }

  @Override
  public void resize(double coefficient) {
    this.coefficient = coefficient;
  }

  public double getCoefficient() {
    return coefficient;
  }

  @Override
  public double getPerimeter() {
    return (getSideA() + getSideB()) * 2;
  }

  public int getSideA() {
    return sideA;
  }

  public void setSideA(int sideA) {
    this.sideA = sideA;
  }

  public int getSideB() {
    return sideB;
  }

  public void setSideB(int sideB) {
    this.sideB = sideB;
  }

  @Override
  public String toString() {
    return "Rectangle: " + " perimeter: " + getPerimeter() + ", sideA: " + sideA + ", sideB: " + sideB;
  }
}


