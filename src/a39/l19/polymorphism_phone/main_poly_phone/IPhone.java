package a39.l19.polymorphism_phone.main_poly_phone;
public class IPhone extends SmartPhone {
  public IPhone(int battery, String generation) {
    super(battery, generation);
  }
  @Override
  public void internet() {
    System.out.println("Safari internet connection");
  }
  @Override
  public void sendMessage() {
    System.out.println("iMessage has been sent");
  }
  // дополнительные спецефические методы
}