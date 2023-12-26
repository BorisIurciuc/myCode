//package hw42.simple.t01;
//
//import hw40.test03.Mug;
//
//public class Cube extends Shape{
//private int side;
//  public Cube(String name, int mass, int side) {
//    super(name, mass);
//    this.side = side;
//  }
//
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
//  public int getVolume() {
//    return super.getVolume();
//  }
//
//  @Override
//  public void setVolume(int volume) {
//    super.setVolume(volume);
//  }
//
//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) {
//      return true;
//    }
//    Cube cube;
//    if (obj instanceof Mug) {
//      cube = (Cube) obj;
//    } else {
//      return false;
//    }
//    return this.getName().equals(cube.getName())
//        && this.getVolume() == cube.getVolume()
//        && this.getSide() == cube.getSide();
//  }
//  @Override
//  public int hashCode() {
//    return super.hashCode();
//  }
//  @Override
//  public String toString() {
//    return super.toString() + " side " + side;
//  }
//}
