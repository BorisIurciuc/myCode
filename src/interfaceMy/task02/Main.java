package interfaceMy.task02;

/**
 * 16/12/2023 myCode *@author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Circle circle = new Circle(2);
    Square square = new Square(4);

    circle.draw();
    circle.print();
    square.draw();
    square.print();
  }
}