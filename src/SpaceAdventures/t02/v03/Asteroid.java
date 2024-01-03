package SpaceAdventures.t02.v03;

public class Asteroid extends Obstacle {
  private static int value;
  public Asteroid(int remainingStrength, int value) {
    super(remainingStrength);
    this.value = value;
  }

  @Override
  public void encounter() {
    System.out.println("Вы нашли астероид с ресурсами!");
  }

  public static int extract(){
    return value;
  }
  @Override
  public String toString() {
    return super.toString() + value;
  }
}
