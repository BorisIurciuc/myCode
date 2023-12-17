package hw40;

import java.util.Objects;

public class Mug extends Dishes {

  private int fluid;           // вместимость, в мл

  public Mug(String color, String material, int fluid) {
    super(color, material);
    this.fluid = fluid;
  }

  public int getFluid() {
    return fluid;
  }

  public void setFluid(int fluid) {
    this.fluid = fluid;
  }



  @Override
  public void service() {

    setFluid(50);
  }

  @Override
  public String toString() {
    return "Чашка " + getColor() + ", " + getMaterial() + " сейчас в ней " + this.fluid + " мл";
  }
  @Override
  public int hashCode() {
  return Objects.hash(getColor(), getMaterial(), fluid);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Mug mug;
    if (obj instanceof Mug) {
      mug = (Mug) obj;
    } else {
      return false;
    }

    return this.getColor().equals(mug.getColor())
        && this.getMaterial().equals(mug.getMaterial())
        && this.fluid == mug.fluid;

  }

}

