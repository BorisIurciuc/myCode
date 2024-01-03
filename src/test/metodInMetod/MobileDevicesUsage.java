package test.metodInMetod;

public class MobileDevicesUsage {

  public static void main(String[] args) {

    useMobile1g();

  }
  static void useMobile1g() {
   Mobile1g mobile1g = new Mobile1g(100);

    mobile1g.call();

    System.out.println("mobile1g instanceof Mobile1g = " + (mobile1g instanceof Mobile1g));
  }
}