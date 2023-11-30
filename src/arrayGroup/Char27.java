package arrayGroup;

import java.util.Scanner;

public class Char27 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input string variable - ");
    String str = scanner.nextLine();                // считывание строки с консоли

    char[] ch = new char[str.length()];             // объявление массива char
    int[] count = new int[27];

    for (int i = 0; i < str.length(); i++) {
      ch[i] = (char)(str.charAt(i) - 96);
    }

    for (int i = 0; i < str.length(); i++) {
      if (1 > ch[i] || ch[i] > 26) {          //выделение отрезка массива из всей ASCII Table
        ch[i] = 0;
      } else {
        count[ch[i]] ++;
      }
    }
    int maxCount = 0;
    int maxIndex = 0;
    for (int i = 0; i < 27; i++) {
      if (maxCount < count[i]) {
        maxCount = count[i];
        maxIndex = i;
      }
    }
    char c = (char)(maxIndex + 96);

    System.out.println("\nstr length " + str.length() + "\ni + 96     " + (maxIndex + 96) +
        "\nchart      '" + c + "'" + "\nmaxCount   [" + maxCount + "]");
  }
}
