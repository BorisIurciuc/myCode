package hw42.over;

/**
 * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Archer archer = new Archer(100, 30);
    Monster monster = new Monster(100, 50);


    // attack

    archer.attack(monster, archer.getAttackPower());

    System.out.println();
    System.out.println(monster);
    System.out.println(archer);
  }
}
