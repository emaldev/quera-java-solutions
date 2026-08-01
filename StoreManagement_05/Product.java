package StoreManagement_05;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    


    public void displayInfo(){
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    public boolean sell(int amount){
        if(quantity >= amount){
            quantity -= amount;
            System.out.println("Purchase complated successfully.");
            System.out.println("Quantity: " + quantity);
            return true;
        }
        System.out.println("A purchase was cancelled due to lack of stock!");
        return false;
    }

    public boolean increaseQuantity(int amount){
            if(amount > 0){
                quantity += amount;
                return true;
            }
            return false;
        
    }



}
