package interfaceMy.task02;

class Square extends Shape implements Drawable {

  public Square(int area) {
    super(area);
  }

  @Override
  public void print(){
    System.out.println("Area " + area);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a square");
  }
}