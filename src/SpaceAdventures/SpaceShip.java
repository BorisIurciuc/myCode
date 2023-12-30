package SpaceAdventures;

public class SpaceShip extends GameObject implements Attacker{
  private String name;
  private int attackPower;
  private int score;
  public SpaceShip(int remainingStrength, String name, int attackPower) {
    super(remainingStrength);
    this.name = name;
    this.attackPower = attackPower;
    this.score = 0;
  }
  @Override
  public void attack(GameObject target) {

  }
  @Override
  public int getRemainingStrength() {
    return super.getRemainingStrength();
  }
  @Override
  public void setRemainingStrength(int remainingStrength) {
    super.setRemainingStrength(remainingStrength);
  }
  @Override
  public boolean isAlive() {
    return super.isAlive();
  }
  @Override
  void destroy() {
    super.destroy();
  }
  @Override
  void hurt(double amount) {
    super.hurt(amount);
  }
  @Override
  public int hashCode() {
    return super.hashCode();
  }
  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
