//Считать с консоли текст. Вывести букву, которая встречается чаще других.
//Если таких букв несколько, вывести в алфавитном порядке.

import java.util.Scanner;
/**
 * 05/11/2023 myCode @author Boris Iurciuc (cohort36)
 * */
public class ArrayGroup {
  public static void inputString(String str, char[] ch) {
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    System.out.println("Array length " + str.length());
  }

  public static void sort(String str, char[] ch) {
    for (int i = 0; i < str.length() - 1; i++) {
      int index = i;
      for (int j = i + 1; j < str.length(); j++) {
        if (ch[index] > ch[j]) {
          index = j;
        }
      }
      if (index == i) {
        continue;
      }
      char temp = ch[index];
      ch[index] = ch[i];
      ch[i] = temp;
    }
  }

  public static void print(String str, char[] ch){
    for (int i = 0; i < str.length(); i++) {
      System.out.print(ch[i] + " ");
    }
    System.out.println();
  }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // Scanner for text input has been announced
    System.out.print("Input string variable - ");
    String str = scanner.nextLine();

    char[] ch = new char[str.length()];  // Convert a string to character array

    inputString(str, ch);
    print(str, ch);
    sort(str, ch);
    print(str, ch);












  }
}
// поиск символа с максимальным количеством повторов
//    int max = 0;                          // начальное значение счетчика максимума повторов
//    int maxCounter = 0;                   // Численное значение буквы или символа для макс. повторов
//
//    for (int j = 1; j < str.length(); j++) {
//      if (max <= count[j]) {
//        max = count[j];
//        maxCounter = intGroupText[j];
//      }
//    }
//    char maxChar = (char) maxCounter;    // перевод численного значение буквы или символа в тип char
//
//    System.out.println("Most common symbol '" + maxChar + "' with repetition count [" + max + "]");