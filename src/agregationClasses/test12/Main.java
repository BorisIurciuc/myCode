package agregationClasses.test12;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */

public class Main {

  public static void main(String[] args) {

    TV tv = new TV(116, 2, 10);
    Remote remote = new Remote(116, tv);

    tv.showTV();
    remote.up();
    tv.showTV();
    remote.down();
    tv.showTV();
    remote.nrCanal(5);
    tv.showTV();
    remote.nrCanal(-5);
    tv.showTV();
  }
}
