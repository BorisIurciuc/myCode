//package hw42.simple.t03;
//class Ball extends Shape {
//  private int rad;
//  public Ball(String name, int rad) {
//    super(name);
//    this.rad = rad;
//  }
//  public int getRad() {
//    return rad;
//  }
//  public void setRad(int rad) {    this.rad = rad;   }
//  @Override
//  public String getName() {
//    return super.getName();
//  }
//  @Override
//  public void setName(String name) {
//    super.setName(name);
//  }
//  @Override
//  public String toString() {
//    return super.toString() + " rad " + rad;
//  }
//}
//class Cube extends Shape {
//  private int side;
//  public Cube(String name, int side) {
//    super(name);
//    this.side = side;
//  }
//  public int getSide() {
//    return side;
//  }
//  public void setSide(int side) {
//    this.side = side;
//  }
//  @Override
//  public String getName() {
//    return super.getName();
//  }
//  @Override
//  public void setName(String name) {
//    super.setName(name);
//  }
//  @Override
//  public String toString() {
//    return super.toString() + " side " + side;
//  }
//}
//
//  abstract class Shape {
//  protected String name;
//
//  public Shape() {}
//  public Shape(String name) {
//    this.name = name;
//  }
//  public String getName() {
//    return name;
//  }
//  public void setName(String name) {
//    this.name = name;
//  }
//  @Override
//  public String toString() {    return  "name = " + name + '}';
//  }
//}
//public class Main {
//  public static void main(String[] args) {
//    Shape shape = null; // Initialize the shape variable to null
//
//    int n = 1;
//    switch (n) {
//      case 1:
//        Ball ball = new Ball("b", 0);
//        ball.setRad(2);
//        shape = ball;
//        break;
//      case 2:
//        Cube cube = new Cube("c", 1);
//        cube.setSide(3);
//        shape = cube;
//        break;
//    }
//
//    int radValue = ((Ball) shape).getRad();
//    System.out.println("Radius of the ball: " + radValue);
//
//    System.out.println(shape.getName());
//  }
//}