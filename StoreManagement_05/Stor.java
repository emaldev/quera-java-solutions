package StoreManagement_05;

import java.util.ArrayList;

public class Stor {

    ArrayList<Product> product = new ArrayList<>();

    public void addProduct(){
        product.add(new Product(null, 0, 0));
    }
    
}
