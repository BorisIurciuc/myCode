package a39.l17;
public class Counter {
  // Статическое поле для отслеживания количества экземпляров класса Counter
  private static int count = 0;

  // Конструктор, увеличивающий счетчик при создании нового экземпляра
  public Counter() {
    count++;
  }

  // Статический метод для получения текущего значения счетчика
  public static int getCount() {
    return count;
  }

  // Пример использования класса Counter
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();


    // Вывод количества созданных экземпляров класса Counter
    System.out.println("Создано экземпляров Counter: " + Counter.getCount());
  }
}