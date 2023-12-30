package a39.l19.polymorphism_phone.main_poly_phone;
public class IPhoneSmartPhone extends BasicSmartPhone {
  public IPhoneSmartPhone(int batteryCapacity, String generation) {
    super(batteryCapacity, generation);
  }
  @Override
  public void internetConnection() {
    System.out.println("Safari internet connection");
  }
  @Override
  public void sendMessage() {
    System.out.println("iMessage has been sent");
  }
  // дополнительные спецефические методы
}