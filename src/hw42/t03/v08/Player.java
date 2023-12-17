package hw42.t03.v08;

public abstract class Player extends Entity {

  public Player(String name, int health, int attackPower) {
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

  public abstract boolean equals(Object obj, double mana);

  public abstract boolean equals(Object obj, int armor);

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
