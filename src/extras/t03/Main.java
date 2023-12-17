package extras.t01;

/**
 * 13/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {


  public static void main(String[] args) {

    Mining mining = new Mining("MiningA", "mining");
    Company customer = new Customer("CustomA");
    Field field = new Field("sand", 1000, 20);

   field.setFieldExtract(19);
    mining.getMiningExtract();

    field.printExtract();
  }
}
