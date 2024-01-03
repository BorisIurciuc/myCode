package a39.l19.polymorphism_phone.main_poly_phone;
public class SmartPhoneUsage {
  public static void main(String[] args) {
    IPhone iPhone = new IPhone(4000,  "5g");
    Xiaomi xiaomi = new Xiaomi(4800, "5g");
    SmartPhone basic = new SmartPhone(3000, "3g");
    usePhone(basic);
    usePhone(iPhone);
    usePhone(xiaomi);
  }
  public static void usePhone(SmartPhone phone) {
    phone.unlock();
    phone.internet();
    phone.takePhoto();
    phone.sendMessage();
    System.out.println("=======================");
  }
}