package arrayObject.task07_age_Loop;

import java.util.Scanner;
class Dog {
  private final String name;            // имя
  private final int age;                // возраст
  public Dog(String name, int age) {    // конструктор
    this.name = name;
    this.age = age;
  }
  public String getName() { return name;  }
  public int getAge() { return age;  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Dog[] dogs = new Dog[3];          // массив объектов на 3 объекта

    for (int i = 0; i < 3; i++) {
      System.out.println("Enter name, age " + i + " ");
      dogs[i] = new Dog(scanner.nextLine(), scanner.nextInt()); // ввод с консоли имя и возраст
      scanner.nextLine();
    }
    for (int i = 0; i < 3; i++) {                               // вывод на консоль
      System.out.println( i + " name " + dogs[i].getName() + ", age " + dogs[i].getAge());
    }
    for (int i = 0; i < 3; i++) {
      if (dogs[i].getName().equals("bob")) {                    // поиск объекта по имени
        System.out.println("For dog with name '" + dogs[i].getName() + "' age " + dogs[i].getAge());
      }
    }
    scanner.close();
  }
}
