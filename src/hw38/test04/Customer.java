package hw38.test04;

import hw38.test03.Person;

/**
 * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Customer extends Person {
  private double money;
  private String productName;
  private int quantity;

  Seller seller;


  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }

  public Customer(String name, Seller seller) {
    super(name);
    this.seller = seller;
  }


  @Override
  public String getName() {
    return super.getName();
  }

  public double getMoney() {
    return money;
  }

  public void print(){
    System.out.println("Покупатель " + getName() + " имеет " + getMoney());
  }


  public void setProductName(String productName, int quantity) {
    this.productName = productName;
    this.quantity = quantity;

  }

  public String getProductName() {
    return productName;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }


  public void sayProductName() {
    System.out.println("я хочу " + getProductName()  + " "
        + getQuantity());
  }


  double price;
  public double buyProduct(Seller seller, String productName, int amount) {
    double price = seller.getPrice(productName, amount);
    return price;
  }

public void printBuyProduct() {
  System.out.println("price" + price);
}



//TODO: finish rest of transaction in this method

  }





