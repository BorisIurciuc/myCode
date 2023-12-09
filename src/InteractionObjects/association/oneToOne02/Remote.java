package InteractionObjects.association.oneToOne02;

/**
 * 07/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Remote {
  private String color;
  private TV tv;

  public Remote(String color) {
    this.color = color;
  }
  public String getColor() {
    return color;
  }

  public void canalRemote(TV tv){
    this.tv = tv;
  }

  public void print(){
    System.out.println("Remote " +
        tv.getCanal() + " " + getColor());
  }
}
