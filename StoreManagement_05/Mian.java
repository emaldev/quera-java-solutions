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
                    System.out.println("Ente name , price and quantity the adding produts: ");
                    String name = input.nextLine();
                    double price = input.nextDouble();
                    int quantity = input.nextInt();
                    store.addProduct(name, price, quantity);
                    break;

                case 2:
                    store.showProducts();
                    break;

                    
                default:
                   
                    break;
           
            }
        }while(choise != 5);
        input.close();
    }
}
