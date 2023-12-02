package depozits.i02;

import java.util.Scanner;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void print(String n, String m, double v){
    System.out.println(" name: " + n + ",\n material: " + m + ",\n volume: " + v);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Deposit deposit = new Deposit();
    deposit.setNameDeposit("aaa");
    deposit.setMaterial(Rock.values()[1].getRock() );
    deposit.setVolume(100);

    String n = deposit.getNameDeposit();
    String m = deposit.getMaterial();
    double v = deposit.getVolume();

    print(n, m, v);
  }
}
