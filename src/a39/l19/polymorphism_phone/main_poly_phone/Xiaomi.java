package a39.l19.polymorphism_phone.main_poly_phone;
public class XiaomiSmartPhone extends BasicSmartPhone {
  public XiaomiSmartPhone(int batteryCapacity, String generation) {
    super(batteryCapacity, generation);
  }
  @Override
  public void unlock() {
    System.out.println("Hello from Xiaomi");
  }
  @Override
  public void sendMessage() {
    System.out.println("this message has been sent with xiaomi device");
  }
  // дополнительные спецефические методы
}