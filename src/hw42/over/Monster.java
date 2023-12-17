package hw42.over;

public class Monster implements Attackable{

  protected int health;
  protected int attackPower;

  public Monster(int health, int attackPower) {
    this.health = health;
    this.attackPower = attackPower;
  }

  public int getHealth() {
    return health;
  }

  public boolean isAlive(){
    return getHealth() > 0;
  }


  @Override
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
  }
  @Override
  public void takeDamage(int attackPower) {
    health -= attackPower;
  }


  @Override
  public String toString() {
    return "Monster{" +
        "health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }




}
