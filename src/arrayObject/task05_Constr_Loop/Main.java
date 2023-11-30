package arrayObject.task05_Constr_Loop;
/**
 * 23/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
import java.util.Scanner;
class Dog {
  private final String name;
  public Dog(String name) { this.name = name;  }
  public String getName() {  return name;  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Dog[] dogs = new Dog[3];

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter name ");
      dogs[i] = new Dog(scanner.nextLine());
    }
    for (int i = 0; i < 3; i++) {
      System.out.println(dogs[i].getName());
    }
    scanner.close();
  }
}
