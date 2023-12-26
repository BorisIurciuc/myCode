package hw42.t04.v03;

public interface Attackable {

  void attack(Attackable target, int attackPower);
  void takeDamage(int attackPower);
}

