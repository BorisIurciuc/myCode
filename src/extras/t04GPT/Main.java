package extras.t04GPT;

/**
 * 13/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Mining mining = new Mining("Straseni", "mining");
    Field field = new Field("sand", 777, 77);

    field.setFieldExtract(19);
    mining.printMining();
    field.printExtract();

  }
}
