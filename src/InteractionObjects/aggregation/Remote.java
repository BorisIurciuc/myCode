package InteractionObjects.aggregation;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Remote {

   TV tv;

  public Remote(TV tv) {
    this.tv = tv;
  }

  public void canalRemote(int canalRemote) {
    tv.setCanalTV(canalRemote);
  }

}
