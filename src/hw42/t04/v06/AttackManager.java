package hw42.t04.v06;

public class AttackManager {
  public void sendAttackManager(Attackable attackable, int attackPower) {
    attackable.attack(attackable, attackPower);
    attackable.takeDamage(attackPower);
    }
}
