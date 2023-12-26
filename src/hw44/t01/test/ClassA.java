package hw44.t01.test;

public abstract class ClassA {

  protected int a;

  public ClassA(int a) {
    this.a = a;
  }

  public abstract int calc();

  @Override
  public String toString() {
    return "ClassA{" +
        "a=" + a +
        '}';
  }
}
