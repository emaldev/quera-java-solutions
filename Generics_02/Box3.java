package Generics_02;

public class Box3<T , U , E> {

    T item;
    
    U price;

    E quantity;

    public void setItem(T item){
        this.item = item;

    }
      public T getItem(){
        return this.item;
      }

    public void setPrice(U price){
        this.price = price;

    }
    public U getPrice(){
        return this.price;
    }

    public void setQuantity(E quantity){
        this.quantity = quantity;
    }

    public E getQuantity(){
        return this.quantity;
    }



}
