package hw38.test03;

/**
 * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  public static void main(String[] args) {

    Customer customer = new Customer("John", 10);

    Product apple = new Product("apple", 10, 1.5);
    Product product2 = new Product("p2", 20, 2.5);
    Product product3 = new Product("p3", 30, 3.5);
    Seller seller = new Seller("Kate", 100, 3);

    customer.print();
    seller.print();

    seller.addProducts(apple);
    seller.addProducts(product2);
    seller.addProducts(product3);
    seller.listProductStorage();

    customer.setProductName("apple");
    customer.sayProductName();

    seller.setProductName(customer.getProductName());
    seller.printQ();

  }
}
