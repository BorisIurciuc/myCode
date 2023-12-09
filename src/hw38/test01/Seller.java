package hw38.test01;

/**
 * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Seller extends Person{

  private double money;
  private Product[] products;
  int n;
  int count;

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

  public void printProduct() {
    for (int i = 0; i < n; i++) {
    System.out.println("Product " + products[i].getName() + " " + products[i].getQuantity()
        + products[i].getPrice());
    }
  }
}
