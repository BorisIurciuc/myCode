package a39.l13;

public class Practice {
  // разделите логически код в мтеоде main по отдельным методам
  public static void main(String[] args) {
    String str = "hello";
    int number = 10;
    int[] arr = {1, 2, 3, 4};

    // Создайте метод void, который выводит на экран приветствие "Привет, мир!".
    System.out.println("Привет, мир!");

    // Напишите метод void, который в качестве аргумена принимает строку и выводит эту строку, переведенную в верхний
    // регистр.
    System.out.println(str.toUpperCase());

    // Создайте метод void, который в качестве аргумена принимает целое число и выводит таблицу умножения на
    // заданное число.
    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " * " + i + " = " + (number * i));
    }

    // Разработайте метод void, который в качестве аргумена принимает целое число и проверяет, является ли
    // переданное ему число четным, и выводит соответствующее сообщение.
    if (number % 2 == 0) {
      System.out.println(number + " - четное число");
    } else {
      System.out.println(number + " - нечетное число");
    }

    // Создайте метод void, который  в качестве аргумена принимает массив целых чисел и выводит каждый элемент
    // массива в отдельной строке.
//        for (int element : arr) {
//            System.out.println(element);
//        }

    printArray(arr);

    // точно также, как число 2 является значением типа int, "привет" - значением типа String,
    // также и для других типов данных мы можем создавать исключительно значения, не сохраняя их в переменную.
    // для массивов это делается следующим образом
    // new тип_массива[] {var1, var2, var3}
    // где var1 - значения, соответсвующие типу данных "тип_массива"
    // такая конструкция называется "анонимный массив", то есть массив,
    // который не сохранен в переменную и существует исключительно в виде значения.
    // пример анонимного массива целых чисел:
    printArray(new int[] {45, -2, -4354, 0, 5});
    printArray(new int[] {});
    printArray(new int[] {1});
    printArray(new int[] {1, 1, 1});
  }


  // метод нужен лишь для демонстрации работы с анонимными массивами, не относится к какому-либо из заданий
  public static void printArray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}