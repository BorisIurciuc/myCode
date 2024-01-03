package a39.l20.interfaces;
/**
 * - В этом примере мы создаем отдельные экземпляры Smartphone для каждого интерфейса (Phone, Camera, MusicPlayer),
 * инициализируя их одинаковыми характеристиками ("Model X", 8 ГБ оперативной памяти, 5.5 дюймов экрана).
 * - Каждый из этих объектов используется для вызова методов соответствующих интерфейсов, демонстрируя
 * многофункциональность класса Smartphone.
 * - Этот подход иллюстрирует полиморфное использование класса Smartphone, где один и тот же класс может быть
 * использован для реализации различных интерфейсных функций.
 */
public class SmartphoneUsage {
  public static void main(String[] args) {
    // Инициализация объекта смартфона как телефона
    Phone myPhone = new Smartphone("Model X", 8, 5.5);
    myPhone.makeCall("123456789");
    myPhone.receiveCall("987654321");

    // Инициализация того же объекта смартфона как камеры
    Camera myCamera = new Smartphone("Model X", 8, 5.5);
    myCamera.takePhoto();
    myCamera.recordVideo();

    // Инициализация того же объекта смартфона как музыкального плеера
    MusicPlayer myMusicPlayer = new Smartphone("Model X", 8, 5.5);
    myMusicPlayer.playMusic("Favorite Song");
    myMusicPlayer.stopMusic();
  }
}