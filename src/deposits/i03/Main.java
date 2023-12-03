package deposits.i03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);



    Deposit[] deposit = new Deposit[3];

    for (int i = 0; i < 3; i++) {
      System.out.print("input extraction: ");
      deposit[i] = new Deposit("aaa", Rock.values()[0].getRock(), 100,
          new int[] {1, 8}, scanner.nextDouble(), scanner.nextLine());
      scanner.nextLine();
    }

    //вывод данных

    for (int i = 0; i < 3; i++) {
      System.out.println();
      deposit[i].printDeposit();
      System.out.println("angle point: " + Arrays.toString(deposit[i].getCoordinate()));
    }
  }
}
