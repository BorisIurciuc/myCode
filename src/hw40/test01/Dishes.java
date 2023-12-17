package hw40;

import java.util.Objects;

public class Dishes {

  private String color;           // цвет
  private String material;

  public Dishes() {
  }
  public Dishes(String color, String material) {

    this.color = color;
    this.material = material;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public void service(){
    System.out.println("угостить");
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, material);
  }
}
