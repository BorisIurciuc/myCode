package interfaceMy.task02;

/**
 * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public abstract class Shape {
protected int area;

  public Shape(int area) {
    this.area = area;
  }

  public int getArea() {
    return area;
  }

  public void print(){
    System.out.println("Area");
  }
}
