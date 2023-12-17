package hw42.t03.v07;

public class Monster extends Entity implements Attackable {

  public Monster(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public int getHealth() {
    return super.getHealth();
  }

  @Override
  public int getAttackPower() {
    return super.getAttackPower();
  }

  @Override
  public void setAttackPower(int attackPower) {
    super.setAttackPower(attackPower);
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
  }

  @Override
  public void takeDamage(int attackPower) {
    health -= attackPower;
  }
}
