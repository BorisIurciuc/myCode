package homework35.test02;

import homework35.test01.LightBulb;

/**
 * 30/11/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    LightBulb lightBulb = new LightBulb("40555454", "USA",
        2000, 40, true, 1.5);

    // Данные в сопроводительных документах товара
    System.out.println("Данные при поступлении товара :");
    System.out.println("BarCode " + lightBulb.getBarCode());
    System.out.println("Price " + lightBulb.getPrice());
    System.out.println("Manufacturer " + lightBulb.getManufacturer());
    System.out.println("Brightness " + lightBulb.getBrightness());
    System.out.println("Price " + lightBulb.getBrightness());
    System.out.println("Power " + lightBulb.getPower());
    System.out.println("is RGB " + lightBulb.isRgb());

    // Обновление данных для продажи
    lightBulb.setBarCode("1122121");
    lightBulb.setPrice(2.1);

    // Данные товара на складе магазина и онлайн-продажи
    System.out.println("\nДанные товара на складе магазина :");
    System.out.println("BarCode " + lightBulb.getBarCode());
    System.out.println("Price " + lightBulb.getPrice());
    System.out.println("Manufacturer " + lightBulb.getManufacturer());
    System.out.println("Brightness " + lightBulb.getBrightness());
    System.out.println("Price " + lightBulb.getBrightness());
    System.out.println("Power " + lightBulb.getPower());
    System.out.println("is RGB " + lightBulb.isRgb());

  }
}
