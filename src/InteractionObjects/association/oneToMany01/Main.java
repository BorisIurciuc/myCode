package InteractionObjects.association.oneToMany01;

/**
 * 07/12/2023 myCode
 *
 * @author Boris Iurciuc (cohort36)
 */
public class Main {

  private static int[] Student;

  public static void main(String[] args) {

  Student student1 = new Student("Jon");
  Student student2 = new Student("Don");
  Student student3 = new Student("Shon");
  Course course = new Course("Math", 3);


  System.out.println(course.getTopic() + ", " + student1.getName());
  System.out.println(course.getTopic() + ", " + student2.getName());
  System.out.println(course.getTopic() + ", " + student3.getName());

  }
}
