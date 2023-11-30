package arrayGroup;
/**
 * 29/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Char10 {

  public static void main(String[] args) {

    int[] arr  = new int[] {9, 0, 8, 0, 1, 2, 4, 4, 5, 7, 8, 4, 3};
    int[] count = new int[10];

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;                          // счетчик
    }
    System.out.println("value\tcount2 " + arr.length);
    for (int i = 0; i < count.length; i++) {
      System.out.println(i + "\t\t\t" + count[i]);
    }
  }
}
