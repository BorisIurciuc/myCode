package SpaceAdventures.t02.v03;

public class Enemy extends Obstacle implements Attacker {
  private static int attackPower;
  public Enemy(int remainingStrength, int attackPower) {
    super(remainingStrength);
    Enemy.attackPower = attackPower;
  }
  public static int getAttackPower() {
    return attackPower;
  }
  @Override
  public void encounter() {
    System.out.println("Враг. атака " + attackPower + " прочность " + remainingStrength);
  }
   @Override
  public void attack(GameObject target) {
     target.hurt(0);
  }
  @Override
  public boolean isAlive() {
    return remainingStrength > 0;
  }
  @Override
  void hurt(double amount) {
    remainingStrength -= SpaceShip.getAttackPower();
  }
  @Override
  public String toString() {
    return  "Враг. атака " + attackPower + " прочность " + remainingStrength;
  }
}
