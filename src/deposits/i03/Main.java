package deposits.i03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int statusDevelop = 0;

    Deposit[] deposit = new Deposit[3];

    for (int i = 0; i < 3; i++) {
      System.out.print("input extraction: ");
      deposit[i] = new Deposit("aaa", Rock.values()[statusDevelop].getRock(), 100,
          new int[] {1, 8}, scanner.nextDouble());
    }
    StatusEnum statusEnum = StatusEnum.values()[statusDevelop];
    //вывод данных
    System.out.println("Статус: " + StatusEnum.values()[0].getStatus());
    for (int i = 0; i < 3; i++) {
      System.out.println();
      deposit[i].printDeposit(statusEnum);
      System.out.println("angle point: " + Arrays.toString(deposit[i].getCoordinate()));
    }
  }
}
