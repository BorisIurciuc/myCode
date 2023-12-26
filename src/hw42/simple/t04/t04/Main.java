package hw42.simple.t04.t04;

public class Main {
  public static void main(String[] args) {
    Shape shape = new Shape("Sh");
    DataManager manager = new DataManager();

    Datable datable = new Ball("b", 5);
    manager.sendDataManager(datable, 14);
    System.out.println(datable);

    datable = new Cube("b", 2);
    manager.sendDataManager(datable, 4);
    System.out.println(datable);
  }
}

//    Shape shape = new Shape("sh");
//
//    Ball ball = new Ball("b", 2);
//
//    Cube cube = new Cube("c", 5);
//
//    shape = cube;
//    System.out.println(shape);
//    shape.setName("s");
//
//
//    ball.give(cube, 10);
//    System.out.println(shape);
//
//    shape = ball;
//    System.out.println(shape);