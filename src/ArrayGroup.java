//Считать с консоли текст. Вывести букву, которая встречается чаще других.
//Если таких букв несколько, вывести в алфавитном порядке.

import java.util.Scanner;

/**
 * 05/11/2023 myCode @author Boris Iurciuc (cohort36)
 * */
public class ArrayGroup {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // Scanner for text input has been announced
    System.out.print("Input string variable - ");
    String str = scanner.nextLine();

    char[] ch = new char[str.length()];  // Convert a string to character array
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    System.out.println("Array length " + str.length());

    int[] intText = new int[str.length()];// объявление массива чисел для кодов char (начальный)

    int length = intText.length;
    for (int i = 0; i < length; i++) {    //преобразование переменных полученного массива char в int
      intText[i] = ch[i];
    }
    int[] intGroupText = new int[length]; // второй массив для подсчета повторяющихся значений
    int[] count = new int[length];        // массив счетчика для одинаковых значений

    // подсчет повторов чисел соответствующих символам типа char
    count[0] = 0;                         // начальное значение счетчика повторов
    int i;                                // инициализация счетчика начального массива
    for (int j = 0; j < length; j++) {    // массив группировки
      i = j;                              // синхронизация массивов
      intGroupText[j] = intText[i];    //присвоение значений начального массива в массив группировки
      for (i = 0; i < length; i++) {      // цикл проверки начального массива и массива группировки
        if (intText[i] == intGroupText[j]) { // в случае совпадения значений суммирование счетчика
          count[j]++;
        }
      }
    }

    // поиск символа с максимальным количеством повторов
    int max = 0;                          // начальное значение счетчика максимума повторов
    int maxCounter = 0;                   // Численное значение буквы или символа для макс. повторов

    for (int j = 1; j < length; j++) {
      if (max <= count[j]) {
        max = count[j];
        maxCounter = intGroupText[j];
      }
    }
    char maxChar = (char) maxCounter;    // перевод численного значение буквы или символа в тип char

    System.out.println("Most common symbol '" + maxChar + "' with repetition count [" + max + "]");
  }
}
