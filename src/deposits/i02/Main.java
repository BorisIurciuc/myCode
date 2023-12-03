//package deposits.i02;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * 20/11/2023 myCode * @author Boris Iurciuc (cohort36)
// */
//public class Main {
//
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int statusDevelop = 0;
//
//    Deposit deposit = new Deposit();
//    //постоянные данные
//    deposit.setNameDeposit("aaa");
//    deposit.setMaterial(Rock.values()[statusDevelop].getRock());
//    deposit.setVolume(100);
//    deposit.setCoordinate(new int[] {1, 8, 1, 6});
//    //ввод данных с консоли
//    System.out.print("input extraction: ");
//    deposit.setExtras(scanner.nextDouble());
//    Status status = Status.values()[statusDevelop];
//    //вывод данных
//    System.out.println("Статус: " + Status.values()[0].getStatus());
//    deposit.printDeposit(status);
//    System.out.println("angle point: " + Arrays.toString(deposit.getCoordinate()));
//  }
//}
