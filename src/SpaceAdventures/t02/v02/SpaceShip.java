package SpaceAdventures.t02.v02;

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
    //target.hurt(0);
  }
   @Override
  public boolean isAlive() {
    return remainingStrength > 0;
  }
  @Override
  void destroy() {
    System.out.println("Астероид добыт, получено " + " очков!");;
  }

  @Override
  void hurt(double amount) {
    remainingStrength -= Enemy.getAttackPower();
  }
  @Override
  public String toString() {
    return name + ". атака " + attackPower + " прочность " + remainingStrength;
  }
}
