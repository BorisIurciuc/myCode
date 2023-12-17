package hw42.t03.v07;

public class Warrior extends Player implements Attackable {

  private int armor;
  public Warrior(String name, int health, int attackPower, int armor) {
    super(name, health, attackPower);
    this.armor = armor;
  }

  public int getArmor() {
    return armor;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }

  @Override
  public int getHealth() {
    return super.getHealth();
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }

  @Override
  public boolean equals(Object obj, double mana) {
    return false;
  }

  @Override
  public boolean equals(Object obj, int armor) {
    return  armor == getArmor() && super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString() + " armor " + armor;
  }

  @Override
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
  }

  @Override
  public void takeDamage(int attackPower) {
    health = health - (attackPower - armor / 2);
  }
}
