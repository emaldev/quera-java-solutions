package StoreManagement_05;

import java.util.ArrayList;

public class Store {

    ArrayList<Product> products = new ArrayList<>();

    // this is add a products.
    public void addProduct(String name, double price, int quantity){
        products.add(new Product(name, price, quantity));
    }

 
    // this method is show the all pruducts 
    public void showProducts(){
        for(Product p : products){
            p.displayInfo();
        }

    }

 
    // this is the find method
    public Product findProduct(String name){
        for(Product p : products){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.println(p.getName());
                 return p;
            }

        }
        return null;
    }

    // this is the sell method .
    public void sellProduct(String name, int quantity){
        Product product = findProduct(name);
        if(product == null){
          
        }else{
           boolean result = product.sell(quantity);
           
            if(result){
                System.out.println("Purchase complated successfully.");
            }else{
                System.out.println("Purches failed.");
            }
            
        }
        
               
        }
    

}
