package InteractionObjects.association.oneToOne01;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Remote {

  private TV tv;

  public void canalRemote(TV tv){
    this.tv = tv;
  }

  public void print(){
    System.out.println("Remote " + tv.getCanal());
  }
}
