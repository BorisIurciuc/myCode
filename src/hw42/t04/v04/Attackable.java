package hw42.t04.v04;

public interface Attackable {

  void attack(Attackable target, int attackPower);
  void takeDamage(int attackPower);
}

