package hw42.t04.v04;//package hw42.t04.v01;
import java.util.Random;
import java.util.Scanner;
/**
 * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    Player player = new Player() {
      @Override
      public boolean equals(Object obj, double mana) {
        return false;
      }
      @Override
      public boolean equals(Object obj, int armor) {
        return false;
      }
    };

    AttackManager manager = new AttackManager();
    Attackable attackable = new Warrior(player.getName(), 10, 2, 2);

    System.out.print("Дайте имя: " );
    player.setName(scanner.nextLine());
    System.out.print("Выбрать боевой класс : 1 - маг, 2 - воин, 3 - лучник : ");
    switch (scanner.nextInt()) {
      case 1:
        attackable = new Mage(player.getName(), 20, 4, 2);
        break;
      case 2:
        attackable = new Warrior(player.getName(), 15, 3, 2);
        break;
      case 3:
        attackable = new Archer(player.getName(), 10, 2);
      }
    Monster monster = new Monster("Drakon", random.nextInt(1,20),
        random.nextInt(1,20));

    System.out.println("перед боем");
    System.out.println(attackable);
    System.out.println(monster + "\n");

    boolean game = false;
    int step = 1;
    do {
      System.out.println("\n" + "Бой " + step);
      //Игрок атакует монстра
      manager.sendAttackManager(monster, player.getAttackPower());
      System.out.println("   Игрок " + player.getName() + " атакует монстра " + monster.getName());
      System.out.println(attackable);
      System.out.println(monster);

      //Монстр атакует игрокa
      monster.attack(attackable, monster.getAttackPower());
      System.out.println("   Монстр " + monster.getName() + " атакует игрока " + player.getName());
      System.out.println(attackable);
      System.out.println(monster);

      System.out.println("player.getHealth()++++++++++++++++++++++++++ " + player.getHealth());

      System.out.println("продолжить ? ");
      step = scanner.nextInt();
      if (step == 0 ) {
        System.out.println("Игра закончена - ничья");
        game = true;
      }
      if (monster.getHealth() <= 0) {
        System.out.println("Монстр проиграл");
        game = true;
      }
//      if (player.getHealth() <= 0) {
//        System.out.println("Игрок проиграл");
//        game = true;
//      }
    } while (!game );

    scanner.close();

  }
}








//    if (mage.getMana() < 1) {
//      System.out.println("Маг " + player.getName() + " не может атаковать у него закончилась мана "
//          + mage.getMana());
//    } else { mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
//      System.out.println("Маг " + player.getName() + " атакует монстра " + monster.getName()
//            + " с силой " + mage.printAttackPower());
//    }



//    Mage mage = new Mage("Gandalf", 20, 10, 0.8);
//    Warrior warrior = new Warrior("Aragon", 5, 2, 6);
//    Archer archer = new Archer("Legolas", 5, 2);
//    Monster monster = new Monster("Sauron", 50, 5);
//
//    // лучник атакует монстра
//    archer.attack(monster, archer.getAttackPower());
//    System.out.println("Лучник " + archer.getName() + " атакует монстра");
//    System.out.println("Монстр " + monster.getName() + " получил " + monster.getDamage()
//        + " урона " + "теперь его здоровье " + monster.getHealth());
//
//    // монстр атакует лучника
//    monster.attack(archer, monster.getAttackPower());  // монстр атакует лучника
//    if (archer.getDamage() == 0 ) {
//      System.out.println("Лучник " + archer.getName() + " уклонился от атаки");
//    } else {
//      System.out.println("Лучник " + archer.getName() + " получил " + archer.getDamage()
//          + " урона " + "теперь его здоровье " + archer.getHealth());
//    }
//
//    // маг атакует монстра
//    if (mage.getMana() < 1) {
//      System.out.println("Маг " + mage.getName() + " не может атаковать у него закончилась мана "
//          + mage.getMana());
//    } else { mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
//      System.out.println("Маг " + mage.getName() + " атакует монстра " + monster.getName()
//            + " с силой " + mage.printAttackPower());
//      }
//
//    // монстр атакует мага
//    monster.attack(mage, monster.getAttackPower()); // монстр атакует мага
//    System.out.println("Монстр " + monster.getName() + " атакует мага " + mage.getName()
//        + " с силой " + monster.printAttackPower());
//    System.out.println("Маг " + mage.getName() + " получил " + mage.getDamage()
//        + " урона " + "теперь его здоровье " + mage.getHealth() + " и мана "
//        + mage.getMana());
//
//    // маг атакует монстра
//    if (mage.getMana() < 1) {
//      System.out.println("Маг " + mage.getName() + " не может атаковать у него закончилась мана "
//          + mage.getMana());
//    } else { mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
//      System.out.println("Маг " + mage.getName() + " атакует монстра " + monster.getName()
//          + " с силой " + mage.printAttackPower());
//    }