package hw42.t03.v08;

import java.util.Objects;

/** 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public abstract class Entity {

  protected String name;
  protected int health;
  protected int attackPower;

  public Entity(String name, int health, int attackPower) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
  }

  public int getHealth() {
    return health;
  }

    public int getAttackPower() {
    return attackPower;
  }

  public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
  }

  public boolean isAlive(){
    return getHealth() > 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Entity entity;
    if (obj instanceof Entity ) {
      entity = (Entity) obj;
    } else  {
      return false;
    }
    return health == entity.getHealth() && attackPower == entity.attackPower && Objects.equals(
        name, entity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, health, attackPower);
  }

  @Override
  public String toString() {
    return "Entity{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }
}
