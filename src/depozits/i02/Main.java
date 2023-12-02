package depozits.i02;

import java.util.Scanner;

/**
 * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void print(String n, String m, double v1, double e, double v2){
    System.out.println("name: " + n + ",\nmaterial: " + m + ",\nvolumeStart: " + v1
        + ",\nextras: " + e + ",\nvolumeEnd: " + v2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Deposit deposit = new Deposit();
    deposit.setNameDeposit("aaa");
    deposit.setMaterial(Rock.values()[1].getRock());
    deposit.setVolume(100);
    System.out.print("input extraction: ");
    deposit.setExtras(scanner.nextDouble());

    Status status = Status.DEVELOP;



    String n = deposit.getNameDeposit();
    String m = deposit.getMaterial();
    double v1 = deposit.getVolume();
    double e = deposit.getExtras();
    double v2 = deposit.extrasVolume();

    print(n, m, v1, e, v2);
  }
}
