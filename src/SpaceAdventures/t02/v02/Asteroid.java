package SpaceAdventures.t02.v02;

public class Asteroid extends Obstacle {
  private int value;
  public Asteroid(int remainingStrength, int value) {
    super(remainingStrength);
    this.value = value;
  }


  @Override
  public void encounter() {
    System.out.println("Вы нашли астероид с ресурсами!");
  }

  public void extract(){
    //SpaceShip.destroy();
  }

  @Override
  public String toString() {
    return super.toString() + value;
  }
}
