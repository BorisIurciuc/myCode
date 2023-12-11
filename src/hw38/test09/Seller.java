//package hw38.test09;
//
///**
// * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
// */
//public class Seller extends Person {
//
//  private double money;
//  private final Product[] products;
//  private final int n;
//  private int count;
//  private int amount;
//  private String productName;
//
//  public Seller(String name, double money, int n) {
//    super(name);
//    this.n = n;
//    this.money = money;
//    products = new Product[n];
//    count = 0;
//  }
//
//  public double getMoney() {
//    return money;
//  }
//  public void printMoneySeller(){
//    System.out.println("В кассе " + getMoney() + " Евро");
//  }
//
//  public void addProducts(Product product) {
//    if (count < n) {
//      products[count] = product;
//      count++;
//    } else {
//      System.out.println("noo more");
//    }
//  }
//
//  public String getName() {
//    return super.getName();
//  }
//
//  public String getProductName() {
//    return productName;
//  }
//
//  public void order(String productName, int amount) {
//    this.productName = productName;
//    this.amount = amount;
//  }
//  public int getAmount() {
//    return amount;
//  }
//
//  public void listProductStorage() {
//    System.out.println("Список продуктов на складе");
//    for (int i = 0; i < n; i++) {
//      System.out.println(" - " + products[i].getName() + " - " + products[i].getQuantity() + " шт, "
//          + products[i].getPrice() + " Евро за единицу товара ");
//    }
//  }
//
//  public int findProducts() {
//    for (int i = 0; i < n; i++) {
//      if (getProductName().equals(products[i].getName()) && getAmount() <= products[i].getQuantity()) {
//        count = i;
//        break;
//      }
//    }
//    return count;
//  }
//
//  public double getPrice() {
//    double price = 0;
//    int count = findProducts();
//    for (int i = 0; i < n; i++) {
//      if (i == 1) {
//        price = products[count].getPrice() * getAmount();
//        break;
//      }
//    }
//    return price;
//  }
//
//  public void receiveMoneySeller(Customer customer) {
//    this.money = getMoney() + customer.getPay();
//  }
//
//  public void saySeller(){
//    System.out.println("Продавец: продукт " + products[findProducts()].getName()
//        + " стоит по " + products[findProducts()].getPrice() + " Евро за единицу"
//    + ", стоимость покупки " + getPrice() + " Euro ");
//  }
//
//  public void currentProductQuantity(int amount) {
//    int count = findProducts();
//    products[count].setQuantityP( products[count].getQuantity() - amount);
//    System.out.println("осталось на складе " + products[count].getQuantity() + " шт "
//        + products[count].getName());
//  }
//}
