package test.metodInMetod;

public class Mobile1g {
  private long phoneNumber;
  public Mobile1g(long phoneNumber) {
    this.phoneNumber = phoneNumber;
    System.out.printf("Mobile1g Constructor message: <1g devices has been activated with number %d>\n", phoneNumber);
  }

  // в этом классе есть лишь один метод - звонить
  public void call() {
    System.out.printf("I call from 1g mobile phone with number %d\n" , phoneNumber);
  }
}
