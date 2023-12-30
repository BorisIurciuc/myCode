package a39.l19.polymorphism_phone.main_poly_phone;
public class BasicSmartPhone {
  private int batteryCapacity;
  private String generation;
  public BasicSmartPhone(int batteryCapacity, String generation) {
    this.batteryCapacity = batteryCapacity;
    this.generation = generation;
  }
  // общие методы для каждого смартфона
  public void unlock(){
    System.out.println("Смартфон разблокирован");
  }
  public void internetConnection() {
    System.out.println("Установлена связь с интернетом");
  }
  public void takePhoto() {
    System.out.println("Сделал фото");
  }
  public void sendMessage() {
    System.out.println("сообщение отправлено");
  }

  // автосгенерированные геттеры и сеттеры, без проверки на логику их востребованности и реализации, просто, чтоб были:
  public int getBatteryCapacity() {
    return batteryCapacity;
  }
  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }
  public String getGeneration() {
    return generation;
  }
  public void setGeneration(String generation) {
    this.generation = generation;
  }
}