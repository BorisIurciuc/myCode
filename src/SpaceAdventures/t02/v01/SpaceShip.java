package SpaceAdventures.t02.v01;

public class SpaceShip extends GameObject implements Attacker {
  private String name;
  private static int attackPower;
  private int score;
  public SpaceShip(int remainingStrength, String name, int attackPower) {
    super(remainingStrength);
    this.name = name;
    SpaceShip.attackPower = attackPower;
    this.score = 0;
  }

  public static int getAttackPower() {
    return attackPower;
  }

  @Override
  public void attack(GameObject target) {
    target.hurt(0);
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
