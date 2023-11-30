package arrayObject.task06_Set_Loop;

import java.util.Scanner;
class Dog {
  private String name;

  public Dog(String name) {this.name = name; }            // конструктор

  public String getName() {
    return name;
  }                // гетер
  public void setName(String name) {
    this.name = name;
  }  // сеттер
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Dog[] dogs = new Dog[3];

    for (int i = 0; i < 3; i++) {               // присвоение нулевых значений
      dogs[i] = new  Dog("");
    }

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter name ");
      dogs[i].setName(scanner.nextLine());      // вызов сеттера
    }
    for (int i = 0; i < 3; i++) {
      System.out.println(dogs[i].getName());    // вызов геттера
    }
    scanner.close();
  }
}
