package hw42.metodEquals;

import hw42.t04.v02.Player;

public class Warrior extends Player {

  private int armor;
  public Warrior(String name, int health, int attackPower, int armor) {
    super(name, health, attackPower);
    this.armor = armor;
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void setName(String name) {
    super.setName(name);
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
  public void setHealth(int health) {
    super.setHealth(health);
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

}
