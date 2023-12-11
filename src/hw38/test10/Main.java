//package hw38.test10;
//
///**
// * 09/12/2023 myCode * @author Boris Iurciuc (cohort36)
// */
//public class Main {
//
//  public static void main(String[] args) {
//
//    Customer customer = new Customer("John", 100);
//
//    Product apple = new Product("apple", 10, 1.5);
//    Product fish = new Product("fish", 20, 2.3);
//    Product pix = new Product("pix", 30, 4);
//    Seller seller = new Seller("Kate", 200, 3);
//
//    seller.addProducts(apple);
//    seller.addProducts(fish);
//    seller.addProducts(pix);
//    seller.listProductStorage();
//    seller.printMoneySeller();
//
//    customer.print();
//    customer.setProductName("pix", 12);
//    customer.sayProductName();
//
//    seller.order(customer.getProductName(), customer.getQuantity());
//
//    seller.getPrice();
//    seller.findProducts();
//    seller.saySeller();
//
//    customer.setPay(seller);
//    customer.printMoneyCustomer(seller);
//    seller.receiveMoneySeller(customer);
//    seller.printMoneySeller();
//    seller.currentProductQuantity(customer.getQuantity());
//  }
//}
