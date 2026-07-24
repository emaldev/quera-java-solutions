package Generics_02;

import java.util.ArrayList;

public class Mian {
    public static void main(String[] args){

        // Generics = A concept where you can write a class interface , or method 
        // that is compatible with defferent data types .
        // <t> type paramter ( placeholder that gets replaced with a real type)
        // <String> type argument (specefies the type )


        
        // this is Steing generics 
         Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());
 
        // this is Integer generics .
        Box<Integer> box2 = new Box<>();
        box2.setItem(1234);
        System.out.println(box2.getItem());

        // Double Stor box 
        Box<Double> box1 = new Box<>();
        box1.setItem(3.14);
        System.out.println(box1.getItem());
        

        
        Product<String , Double> product1 = new Product<>("apple" , 0.50);

        Product<String , Integer> product2 = new Product<>("Orange" , 10);

        System.out.println(product1.getItem() + "\n" + product1.getPrice());

        System.out.println(product2.getItem() + "\n " + product2.getPrice());
 
  
        Box3<String , Integer, Double> myBox3 = new Box3<>();
        myBox3.setItem("Apple");
        myBox3.setPrice(2);
        myBox3.setQuantity(23.50);

        System.out.println(myBox3.getItem());
        System.out.println(myBox3.getPrice());
        System.out.println(myBox3.getQuantity());

        
    }
    
}
