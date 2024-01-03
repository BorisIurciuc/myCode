package a39.l18.main_inheritance;

public class Mobile {
  public static void main(String[] args) {
    useMobile1g();
    useMobile2g();
  }

  static void useMobile1g() {
    Mobile1g mobile = new Mobile1g(100);
    mobile.call();
    System.out.println();
  }

  static void useMobile2g() {
    Mobile2g mobile = new Mobile2g(200);
    mobile.call();
    mobile.sendSMS("hello there!");
  }
}

class Mobile1g {
  private long phoneNumber;
  public Mobile1g(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }
  public void call() {
    System.out.printf("I call phone with number %d\n" , phoneNumber);
  }
}

 class Mobile2g extends Mobile1g {
  public Mobile2g(long phoneNumber) {
    super(phoneNumber);
  }
   public void sendSMS(String message) {
      System.out.printf("Message <%s> sent from 2g with nr %d\n", message, super.getPhoneNumber());
    }
}
