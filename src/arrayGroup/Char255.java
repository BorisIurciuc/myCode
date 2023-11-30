package arrayGroup;

import java.util.Scanner;

public class Char255 {

     public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("Input string variable - ");
      String str = scanner.nextLine();                // считывание строки с консоли

      char[] ch = new char[str.length()];             // объявление массива char
      int[] count = new int[255];

      for (int i = 0; i < str.length(); i++) {
        ch[i] = str.charAt(i);
      }

      for (int i = 0; i < str.length(); i++) {
        count[ch[i]] ++;
      }

      int maxCount = 0;
      int maxIndex = 0;
      for (int i = 0; i < 255; i++) {
        if (maxCount < count[i]) {
          maxCount = count[i];
          maxIndex = i;
        }
      }
      char c = (char)(maxIndex);

      System.out.println("\nstr length " + str.length() + "\ni          " + maxIndex +
          "\nchart      '" + c + "'" + "\nmaxCount   [" + maxCount + "]");
    }
  }
