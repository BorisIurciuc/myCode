package SpaceAdventures.task01;

/**
 * 30/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class GameObject {

  private int remainingStrength;

  public GameObject(int remainingStrength) {
    this.remainingStrength = remainingStrength;
  }

  public int getRemainingStrength() {
    return remainingStrength;
  }

  public void setRemainingStrength(int remainingStrength) {
    this.remainingStrength = remainingStrength;
  }

  public boolean isAlive() {
    return remainingStrength > 0;
  }

}
