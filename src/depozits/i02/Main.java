package depozits.i02;

import java.util.Scanner;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Deposit[] deposit = new Deposit[3];

    for (int i = 0; i < 3; i++) {
      deposit[i] = new Deposit();
    }
    System.out.println("input volume: ");

    for (int i = 0; i < 3; i++) {
      System.out.print("d [" + i + "] ");
      deposit[i] = new Deposit(scanner.nextDouble());
    }

    deposit[0].setNameDeposit("aaa");
    deposit[1].setNameDeposit("bbb");
    deposit[2].setNameDeposit("ccc");
    deposit[0].setRock("r1");
    deposit[1].setRock("r2");
    deposit[2].setRock("r3");
    for (int i = 0; i < 3; i++) {
      System.out.println(deposit[i].getNameDeposit() + " " + deposit[i].getRock() + " " +
          deposit[i].getVolume());
    }
  }
}
