package arrayObject.task05_Constr_Loop_fromMetod;

import hw42.metodEquals.Entity;
import java.util.Scanner;
class Main {

  class Dog{
    private final String name;
    public Dog(String name) {
      this.name = name;
    }
    public String getName() {
      return name;
    }
  }

  public Dog[] getDogs() {

    Dog[] dogs = new Dog[3];
      for (int i = 0; i < 3; i++) {
        dogs[i] = new Dog("aaa");
      }
    return dogs;
}

  public static void main(String[] args) {
    Main main = new Main();
    Dog[] dogs = main.getDogs();

    for (int i = 0; i < 3; i++) {
     System.out.println(dogs[i].getName());
    }
  }
}


