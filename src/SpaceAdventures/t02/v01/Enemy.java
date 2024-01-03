package SpaceAdventures.t02.v01;

public class Enemy extends Obstacle implements Attacker {
  private int attackPower;
  public Enemy(int remainingStrength, int attackPower) {
    super(remainingStrength);
    this.attackPower = attackPower;
  }
  public int getAttackPower() {
    return attackPower;
  }
  public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
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
  public void encounter() {
    System.out.println("Сила атаки " + getAttackPower() + " прочность ");
  }
  @Override
  public void attack(GameObject target) {

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
    remainingStrength -= SpaceShip.getAttackPower();

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
    return super.toString();
  }
}
