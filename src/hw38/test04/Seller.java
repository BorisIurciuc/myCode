package hw38.test04;

/**
 * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Seller extends Person {

  private double money;
  private Product[] products;
  private int n;
  private int count;
  private int quantity;



  public Seller(String name, double money, int n) {
    super(name);
    this.n = n;
    this.money = money;
    products = new Product[n];
    count = 0;
  }

  public void addProducts(Product product) {
    if (count < n) {
      products[count] = product;
      count++;
    } else {
      System.out.println("noo more");
    }
  }

  public String getName() {
    return super.getName();
  }

  public void print(){
    System.out.println("Меня зовут " + getName());
  }

  public void listProductStorage() {
    System.out.println("Список продуктов на складе");
    for (int i = 0; i < n; i++) {
    System.out.println("Product " + products[i].getName() + " " + products[i].getQuantity() + " "
        + products[i].getPrice());
    }
  }

  private String productName;

  public void setProductName(String productName, int quantity) {
    this.productName = productName;
    this.quantity = quantity;
  }

  public String getProductName() {
    return productName;
  }
  public int getQuantity() {
    return quantity;
  }

  public void printQ() {
    System.out.println("вы хотите " + getProductName() +" " + getQuantity() +" ?");
  }
  int q = 0;

  public void findProducts(Product product) {
    int i = -1;

    System.out.println("1 product " + getProductName());
    for (i = 0; i < n; i++) {

      boolean check;
      if (getProductName().equals(products[i].getName())) {
        check = true;
      } else {
        check = false;
      }
      if (!check) {
          System.out.println("2 product " + products[i].getName());
      }
      if (check) {
        //products[i].setQuantity(quantity);
        System.out.println("3 product " + products[i].getName());
        break;
      }
    }
    }


//  public int findProducts(Product product) {
//    boolean found = false;
//    for (int i = 0; i < n; i++) {
//      if(!found){
//        if (products[i] == product) {
//          found = true;
//        }
//        if (found) {
//          products[i].setQuantity(quantity);
//        }
//      }
//    }
//    return q;
//  }
  public void newQuantity(){
    System.out.println("q " + q);

  }

  public double getPrice(String productName, double amount) {
    return 5.0;
  }

}
