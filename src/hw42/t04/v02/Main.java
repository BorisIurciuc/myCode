//package hw42.t04.v02;//package hw42.t04.v01;
//
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * 16/12/2023 myCode * @author Boris Iurciuc (cohort36)
// */
//public class Main {
//
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    Random random = new Random();
//
//    Player player = null;
////    player = new Player() {
////      @Override
////      public boolean equals(Object obj, double mana) {
////        return false;
////      }
////
////      @Override
////      public boolean equals(Object obj, int armor) {
////        return false;
////      }
////    };
//
//    System.out.print("Дайте имя: ");
//    String namePlayer = scanner.nextLine();
//
//    System.out.print("Выбрать боевой класс : 1 - маг, 2 - воин, 3 - лучник : ");
//    int classPlayer = scanner.nextInt();
//
//    switch (classPlayer) {
//      case 1:
//        Player mage = new Mage("", 0, 0, 2);
//        mage.setName(namePlayer);
//        mage.setHealth(20);
//        mage.setAttackPower(20);
//        player = mage;
//        break;
//      case 2:
//        Player warrior = new Warrior("", 0, 0, 10);
//        warrior.setName(namePlayer);
//        warrior.setHealth(15);
//        warrior.setAttackPower(15);
//        player = warrior;
//        break;
//      case 3:
//        Player archer = new Archer("-", 0,  0);
//        archer.setName(namePlayer);
//        archer.setHealth(10);
//        archer.setAttackPower(10);
//        player = archer;
//    }
//
//    if (player instanceof Mage) {
//     // ((Player) player).getMana();
//      ((Mage) player).printAttackPower();
//    }
//
//
//    Monster monster = new Monster("Sauron", 0, 0);
//    monster.setHealth(random.nextInt(1, 20));
//    monster.setAttackPower(random.nextInt(1, 20));
//
//    // маг атакует монстра
//    if (((Mage) player).getMana() < 1) {
//      System.out.println("Маг " + player.getName() + " не может атаковать у него закончилась мана "
//          + ((Mage) player).getMana());
//    } else { ((Mage) player).attack(monster, player.getAttackPower()); // маг атакует монстра
//      System.out.println("Маг " + player.getName() + " атакует монстра " + monster.getName()
//            + " с силой " + ((Mage) player).printAttackPower());
//      }
//    System.out.println(monster);
//    System.out.println(player);
//
//  }
//}
//
//
//
//
//////    Mage mage = new Mage("Gandalf", 20, 10, 0.8);
//////    Warrior warrior = new Warrior("Aragon", 5, 2, 6);
//////    Archer archer = new Archer("Legolas", 5, 2);
//////    Monster monster = new Monster("Sauron", 50, 5);
//////
//////    // лучник атакует монстра
//////    archer.attack(monster, archer.getAttackPower());
//////    System.out.println("Лучник " + archer.getName() + " атакует монстра");
//////    System.out.println("Монстр " + monster.getName() + " получил " + monster.getDamage()
//////        + " урона " + "теперь его здоровье " + monster.getHealth());
//////
//////    // монстр атакует лучника
//////    monster.attack(archer, monster.getAttackPower());  // монстр атакует лучника
//////    if (archer.getDamage() == 0 ) {
//////      System.out.println("Лучник " + archer.getName() + " уклонился от атаки");
//////    } else {
//////      System.out.println("Лучник " + archer.getName() + " получил " + archer.getDamage()
//////          + " урона " + "теперь его здоровье " + archer.getHealth());
//////    }
//////
//////    // маг атакует монстра
//////    if (mage.getMana() < 1) {
//////      System.out.println("Маг " + mage.getName() + " не может атаковать у него закончилась мана "
//////          + mage.getMana());
//////    } else { mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
//////      System.out.println("Маг " + mage.getName() + " атакует монстра " + monster.getName()
//////            + " с силой " + mage.printAttackPower());
//////      }
//////
//////    // монстр атакует мага
//////    monster.attack(mage, monster.getAttackPower());
//////    System.out.println("Монстр " + monster.getName() + " атакует мага " + mage.getName()
//////        + " с силой " + monster.printAttackPower());
//////    System.out.println("Маг " + mage.getName() + " получил " + mage.getDamage()
//////        + " урона " + "теперь его здоровье " + mage.getHealth() + " и мана "
//////        + mage.getMana());
//////
//////    // маг атакует монстра
//////    if (mage.getMana() < 1) {
//////      System.out.println("Маг " + mage.getName() + " не может атаковать у него закончилась мана "
//////          + mage.getMana());
//////    } else { mage.attack(monster, mage.getAttackPower());      // маг атакует монстра
//////      System.out.println("Маг " + mage.getName() + " атакует монстра " + monster.getName()
//////          + " с силой " + mage.printAttackPower());
//////    }