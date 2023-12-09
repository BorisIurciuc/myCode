package InteractionObjects.aggregation;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class TV {
private int canalTV;

  public TV(int canalTV) {
    this.canalTV = canalTV;
  }

  public int getCanalTV() {
    return canalTV;
  }
  public void setCanalTV(int canalTV) {
    this.canalTV = canalTV;
  }
  public void show() {
    System.out.println("show canal " + getCanalTV());
  }

}
