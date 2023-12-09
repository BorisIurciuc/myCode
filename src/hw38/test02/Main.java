package hw38.test02;

import hw38.test01.Customer;
import hw38.test01.Product;
import hw38.test01.Seller;

public class Main {

  static class Product {
    private String name;

    public Product() {
      this("");
    }

    public Product(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }


  }

  static class Seller{

    private Product[] products;
    int n;
    int count;

    public Seller(int n) {
      this.n = n;
      products = new Product[n];
      count = 0;
    }

    public void addProducts(Product product) {
      if (count < n) {
        products[count] = product;
        count++;
      }
      else {
        System.out.println("noo more");
      }
    }

    public void printProduct() {
      for (int i = 0; i < count; i++) {
        System.out.println("Product" + products[i].getName());
      }
    }
  }

  public static void main(String[] args) {

    Product apple = new Product("apple");
    Product product2 = new Product("p2");
    Product product3 = new Product("p3");
    Seller seller = new Seller(3);

    seller.addProducts(apple);
    seller.addProducts(product2);
    seller.addProducts(product3);
    seller.printProduct();
  }
}
