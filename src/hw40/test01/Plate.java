package hw40;

public class Plate extends Dishes {

  private int diameter;

  public Plate(int diameter) {
    this.diameter = diameter;
  }

  public Plate(String color, String material, int diameter) {
    super(color, material);
    this.diameter = diameter;
  }


  public int getDiameter() {
    return diameter;
  }

  public void setDiameter(int diameter) {
    this.diameter = diameter;
  }

  @Override
  public void service() {
    System.out.print("Положить кусочек торта ");
  }

  @Override
  public String toString() {
    return "Тарелка " +  getColor()
        + ", " + getMaterial() + " диаметром " + this.diameter + " см";
  }
//Чашка - " + getColor() + "цвета, " + getMaterial() + ", на- " + this.capacity;
}
