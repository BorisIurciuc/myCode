package hw42.simple.t04.t04;
public  class Shape {
  protected String name;

  public Shape(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {    return  "name = " + name + '}';
  }
}