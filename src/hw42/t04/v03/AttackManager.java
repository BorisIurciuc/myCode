package hw42.t04.v03;

public class AttackManager {
  public void sendAttackManager(Attackable attackable, int attackPower) {
    attackable.attack(attackable, attackPower);
    attackable.takeDamage(attackPower);
    }
}
