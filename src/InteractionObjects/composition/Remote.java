package InteractionObjects.composition;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Remote {

  TV tv;

  public Remote(int canalRem) {
    this.tv = new TV(canalRem);
  }

  public void canalR(int canal) {
    tv.setCanal(canal);
  }

  public void print() {
    System.out.println("canal " + tv.getCanal());
  }
}
