package interfaceMy.task02;

class Circle extends Shape implements Drawable{

  public Circle(int area) {
    super(area);
  }
  @Override
  public void print(){
    System.out.println("Area " + area);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }
}