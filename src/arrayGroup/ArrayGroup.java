package arrayGroup;//Считать с консоли текст. Вывести букву, которая встречается чаще других.
//Если таких букв несколько, вывести в алфавитном порядке.

import java.util.Scanner;

/**
 * 05/11/2023 myCode @author Boris Iurciuc (cohort36)
 */
public class ArrayGroup {

  public static void inputString(String str, char[] ch) {     // перевод String to char
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    System.out.println("Array length " + str.length());
  }

  public static void sort(String str, char[] ch) {            // Сортировка массива char
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

  public static void maximum(String str, char[] ch) {   // подсчет повторов в сортированном массиве

    int[] sumCount = new int[str.length()];             // массив счетчика повторов
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (ch[i - 1] == ch[i]) {
        count++;
        sumCount[i] = count;
      } else {                                          // сброс счетчика повторов при смене символа
        count = 1;
      }
    }
    int max = 0;
    char maxCountChar = ' ';
    for (int i = 1; i < str.length(); i++) {            // нахождение максимального значения
      if (max <= sumCount[i]){
        max = sumCount[i];
        maxCountChar = ch[i];
      }
    }
    System.out.println("max " + max + " Char " + maxCountChar);
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input string variable - ");
    String str = scanner.nextLine();                // считывание строки с консоли

    char[] ch = new char[str.length()];             // объявление массива char

    inputString(str, ch);   // вызов метода - перевод String to char
    sort(str, ch);          // вызов метода - сортировка массива char
    maximum(str, ch);       // вызов метода - подсчет повторов и нахождение максимального значения
  }
}
