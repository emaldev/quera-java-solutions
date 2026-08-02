package StoreManagement_05;

import java.util.Scanner;

public class Mian {
    public static void  main(String[] args){
         Scanner input  = new Scanner(System.in);
         Store store = new Store();
         int choise;


        do{
           
            System.out.println("++++++++++> Welcom to my Shop <++++++++++");
            System.out.println("1 . for add products");
            System.out.println("2 . for show products");
            System.out.println("3 . for find a product.");
            System.out.println("4 . for sell products.");
            System.out.println("5 . for Exit");
            System.out.print("Enter yout choise:");
             choise = input.nextInt();
            input.nextLine();

            switch (choise) {
                case 1 :
                    System.out.println("Ente name , price{float} and quantity{integer} the adding produts: ");
                    String name = input.nextLine();
                    double price = input.nextDouble();
                    int quantity = input.nextInt();
                    store.addProduct(name, price, quantity);
                    break;

                case 2:
                    store.showProducts();
                    break;

                case 3: 
                    System.out.print("Please Enter your product name :");
                    name = input.nextLine();
                    store.findProduct(name);
                    break;

                case 4: 
                    System.out.println("Please enter name and quantity for sell: ");
                    name = input.nextLine();
                    quantity = input.nextInt();
                    store.sellProduct(name, quantity);
                    break;

                    
                default:
                   
                    break;
           
            }
        }while(choise != 5);
        input.close();
    }
}
