package a39.l19.polymorphism_phone.main_poly_phone;
public class Xiaomi extends SmartPhone {
  public Xiaomi(int battery, String generation) {
    super(battery, generation);
  }
//  @Override
//  public void internet() {
//    System.out.println("Xiaomi internet connection");
//  }
  @Override
  public void unlock() {
    System.out.println("Hello from Xiaomi");
  }
  @Override
  public void sendMessage() {
    System.out.println("message has been sent with xiaomi ");
  }
  // дополнительные спецефические методы
}