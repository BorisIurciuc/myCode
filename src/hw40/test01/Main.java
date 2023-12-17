package hw40;

import hw39.task0205_2.Developer;
import hw39.task0205_2.Manager;

/**
 * 11/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {


  public static void main(String[] args) {

    Dishes mug1 = new Mug("черная", "фарфоровая", 0);
    Dishes mug2 = new Mug("черная", "фарфоровая", 0);
    Dishes plate1 = new Plate("белая", "фарфоровая", 25);
    Dishes plate2 = new Plate("белая", "фарфоровая", 25);

    System.out.println(mug1);
    System.out.println(mug2);
    System.out.println(mug1.equals(mug2));
    mug1.service();
    System.out.println(mug1);
    System.out.println(mug1.equals(mug2));

  }
}


