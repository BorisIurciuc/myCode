package hw44.t01.test;

public class ClassB extends ClassA{

  private int b;

  public ClassB(int a, int b) {
    super(a);
    this.b = b;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  @Override
  public int calc() {
    a += getB();
    return a;
  }

}
