package a39.l19.polymorphism_phone.main_poly_phone;
public class SmartPhone {
  private int battery;
  private String generation;
  public SmartPhone(int battery, String generation) {
    this.battery = battery;
    this.generation = generation;
  }
  // общие методы для каждого смартфона
  public void unlock(){
    System.out.println("1 Смартфон разблокирован");
  }
  public void internet() {
    System.out.println("2 Установлена связь с интернетом");
  }
  public void takePhoto() {
    System.out.println("3 Сделал фото");
  }
  public void sendMessage() {
    System.out.println("4 Сообщение отправлено");
  }

  // автосгенерированные геттеры и сеттеры, без проверки на логику их востребованности и реализации, просто, чтоб были:
  public int getBattery() {
    return battery;
  }
  public void setBattery(int battery) {
    this.battery = battery;
  }
  public String getGeneration() {
    return generation;
  }
  public void setGeneration(String generation) {
    this.generation = generation;
  }
}