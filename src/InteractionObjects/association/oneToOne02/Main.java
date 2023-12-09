package InteractionObjects.association.oneToOne02;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    TV tv = new TV(5);
    Remote remote = new Remote("black");

    remote.canalRemote(tv);
    tv.setRemote(remote);


    tv.print();
    remote.print();

    tv.setCanal(8);

    tv.print();
    remote.print();
  }
}
