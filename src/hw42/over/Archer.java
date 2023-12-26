package hw42.over;

public class Archer implements Attackable{
  protected int health;
  protected int attackPower;

  public Archer(int health, int attackPower) {
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
  public void attack(Attackable target, int attackPower) {
    target.takeDamage(attackPower);
  }

  @Override
  public void takeDamage(int attackPower) {
    health -= attackPower;
  }

  @Override
  public String toString() {
    return "Archer{" +
        "health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }


}
