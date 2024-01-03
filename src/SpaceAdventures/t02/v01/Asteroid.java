package SpaceAdventures.t02.v01;

public class Asteroid extends Obstacle {
  private int value;
  public Asteroid(int remainingStrength, int value) {
    super(remainingStrength);
    this.value = value;
  }

  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  public int extract(){
    return value;
  }
  public void destroy(){
    System.out.println("Астероид добыт, получено (ценность) очков!");
  }
  @Override
  public void encounter() {
    System.out.println("Вы нашли астероид с ресурсами!");
  }
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
  @Override
  public int hashCode() {
    return super.hashCode();
  }
  @Override
  public String toString() {
    return super.toString() + getValue();
  }
}
