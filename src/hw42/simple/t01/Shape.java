//package hw42.simple.t01;
//import hw40.test03.Mug;
//import java.util.Objects;
//
//public class Shape {
//  protected String name;
//  protected int volume;
//
//  public Shape(String name, int volume) {
//    this.name = name;
//    this.volume = volume;
//  }
//  public String getName() {
//    return name;
//  }
//  public void setName(String name) {
//    this.name = name;
//  }
//  public int getVolume() {
//    return volume;
//  }
//  public void setVolume(int volume) {
//    this.volume = volume;
//  }
//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) {
//      return true;
//    }
//    Shape shape;
//    if (obj instanceof Mug) {
//      shape = (Shape) obj;
//    } else {
//      return false;
//    }
//    return this.getName().equals(shape.getName())
//        && this.getVolume() == shape.getVolume();
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(getName(), getVolume());
//  }
//  @Override
//  public String toString() {
//    return "Shape{" +
//        "name='" + name + '\'' +
//        ", mass=" + volume +
//        '}';
//  }
//}