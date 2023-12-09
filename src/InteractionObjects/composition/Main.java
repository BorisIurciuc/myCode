package InteractionObjects.composition;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {
    Remote remote = new Remote(5);

    remote.canalR(8);
    remote.print();
  }
}
