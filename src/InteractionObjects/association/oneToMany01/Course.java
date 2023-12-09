package InteractionObjects.association.oneToMany01;

/**
 * 07/12/2023 myCode
 *
 * @author Boris Iurciuc (cohort36)
 */
public class Course {
  private String topic;
  private Student[] students;
  private int n;

  public Course(String topic, int n){
   this.topic = topic;
   this.n = n;
   students = new Student[n];
  }
  public String getTopic() {
    return topic;
  }
}
