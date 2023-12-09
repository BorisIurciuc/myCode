package InteractionObjects.aggregation;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    TV tv = new TV(2);
    Remote remote = new Remote(tv);

    remote.canalRemote(25);
    tv.show();

  }
}
