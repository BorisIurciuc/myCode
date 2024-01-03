package a39.l19.polymorphism_phone;

public class BasicSmartPhone {
  private int batteryCapacity;
  private double displayDiagonalInch;
  private int storage;
  private String generation;

  public BasicSmartPhone(int batteryCapacity, double displayDiagonalInch,  int storage, String generation) {
    this.batteryCapacity = batteryCapacity;
    this.displayDiagonalInch = displayDiagonalInch;
    this.storage = storage;
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

  public double getDisplayDiagonalInch() {
    return displayDiagonalInch;
  }

  public void setDisplayDiagonalInch(double displayDiagonalInch) {
    this.displayDiagonalInch = displayDiagonalInch;
  }



  public int getStorage() {
    return storage;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }

  public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }
}