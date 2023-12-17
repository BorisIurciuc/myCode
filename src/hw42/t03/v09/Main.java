package hw42.t03.v09;

/**
 * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Mage mage = new Mage("Gandalf", 200, 40, 2.4);
    Warrior warrior = new Warrior("Aragon", 100, 20, 60);
    Archer archer = new Archer("Legolas", 100, 10);
    Monster monster = new Monster("Sauron", 500, 50);

    System.out.println("Лучник " + archer.getName() + " атакует монстра");
    archer.attack(monster,archer.getAttackPower());
    System.out.println("Монстр " + monster.getName() + " получил " + monster.getDamage()
        + " урона " + "теперь его здоровье " + monster.getHealth());

  }
}

//       System.out.println(mage);
//       System.out.println(warrior);
//       System.out.println(archer);
//       System.out.println(monster);
//
//       // attack
//       monster.attack(archer,monster.getAttackPower());  // монстр атакует лучника
//       monster.attack(warrior,monster.getAttackPower()); // монстр атакует воина
//       monster.attack(mage, monster.getAttackPower());   // монстр атакует воина
//
//       archer.attack(monster,archer.getAttackPower());   // лучник атакует монстра
//       warrior.attack(monster,warrior.getAttackPower()); // воин атакует монстра
//       mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
//
//       System.out.println();
//       System.out.println(monster);            // состояние монстра
//       System.out.println(archer);             // состояние лучника
//       System.out.println(warrior);            // состояние воина
//       System.out.println(mage);               // состояние мага