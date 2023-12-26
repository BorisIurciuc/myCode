package hw44.t01.test;

/**
 * 22/12/2023 myCode
 *
 * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    ClassB classB = new ClassB(0,0);

    int c;

    classB.calc();
    classB.setB(5);
    c = classB.calc();
    System.out.println("c " + c );
    System.out.println(classB);

  }

}
