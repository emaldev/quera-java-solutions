package StoreManagement_05;

import java.util.ArrayList;

public class Store {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name, double price, int quantity){
        products.add(new Product(name, price, quantity));
    }


    public void showProducts(){
        for(Product p : products){
            p.displayInfo();
        }

    }

  public boolean findProduct(String name){
   for(Product p : products){
    if(p.getName().equalsIgnoreCase(name)){
        System.out.println(p.getName());
        return true;
    }
   
   }
    return false;
  }

}
