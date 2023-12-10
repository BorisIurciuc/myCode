//package hw38.test07;
//
//import hw38.test03.Person;
//
//public class Customer extends Person {
//  private double money;
//  private String productName;
//  private int quantity;
//
//
//
////  Seller seller;
//
//  public Customer(String name, double money) {
//    super(name);
//    this.money = money;
//  }
//
////  public Customer(String name, Seller seller) {
////    super(name);
////    this.seller = seller;
////  }
//
//  @Override
//  public String getName() {
//    return super.getName();
//  }
//
//
//  public double getMoney() {
//    return money;
//  }
//
//
//  public void print(){
//    System.out.println("Покупатель " + getName() + " имеет " + getMoney());
//  }
//
//  public void setProductName(String productName, int quantity) {
//    this.productName = productName;
//    this.quantity = quantity;
//  }
//
//  public String getProductName() {
//    return productName;
//  }
//  public void setQuantity(int quantity) {
//    this.quantity = quantity;
//  }
//
//  public int getQuantity() {
//    return quantity;
//  }
//
//  public void sayProductName() {
//    System.out.println("Покупатель: я хочу " + getProductName()  + " в количестве "
//        + getQuantity() + " штук");
//  }
//
//  double price;
//  public double buyProduct(Seller seller) {
//    double price = seller.getPrice();
//    System.out.println("seller.getPrice() " + seller.getPrice());
//
//    return price;
//  }
//
//  public void setMoney(Seller seller) {
//    if (seller.getPrice() <= getMoney()){
//      this.money = getMoney() - seller.getPrice();
//
//      System.out.println(
//          "Покупатель заплатил " + seller.getPrice() + " на счету осталось " + money);
//    } else {
//      System.out.println("Извините нет денег");
//    }
//
//  }
//
////  public void printMoneyCustomer(Seller seller) {
////    System.out.println("setMoney() " + setMoney(seller));
////  }
//
//public void printBuyProduct() {
//  System.out.println("price" + price);
//}
//
//
//
////TODO: finish rest of transaction in this method
//
//  }
//
//
//
//
//
