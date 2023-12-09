package InteractionObjects.association.oneToOne02;

/**
 * 07/12/2023 myCode  *  @author Boris Iurciuc (cohort36)
 */
public class TV {
  private int canal;
  Remote remote;

  public TV(int canal) {
    this.canal = canal;
  }
  public int getCanal() {
    return canal;
  }
  public void setCanal(int canal) {
    this.canal = canal;
  }



  public void setRemote(Remote remote) {
    this.remote = remote;
  }

  public void print(){
    System.out.println("TV "
        + getCanal() + " " + remote.getColor());
  }


}
