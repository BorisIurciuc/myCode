package agregationClasses.test12;

/**
 * 05/12/2023 homework * @author Boris Iurciuc (cohort36)
 */
public class TV {

  private int frequencyTv;
  private int canalTV;
  private int maxCanal;

  public TV(int frequencyTv, int canalTV, int maxCanal) {
    this.frequencyTv = frequencyTv;
    this.canalTV = canalTV;
    this.maxCanal = maxCanal;
  }

  public int getFrequencyTv() {
    return frequencyTv;
  }

  public void setCanalTV(int canalTV) {
    if (canalTV > 0) {
      this.canalTV = canalTV;
    }
  }

  public int getCanalTV() {
    return canalTV;
  }

  public void upTV() {
    canalTV++;
  }

  public void downTV() {
    canalTV--;
  }

  public void showTV() {
    System.out.println("CanalTV " + getCanalTV());
  }
}
