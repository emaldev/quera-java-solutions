package OPP_04;

import java.util.Scanner;

public class BMain {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        BankAccount aciAccount = new BankAccount("6078701801218394", "Ahmad", 234.890);
       

       


        int money;
        double amount;
        do{
        System.out.println("This is tha banck men");
        System.out.println("1 . for deposit .");
        System.out.println("2 . for withdraw");
        System.out.println("3 . display Balance");
        System.out.println("4 . Exit");

        money = scanner.nextInt();
        scanner.nextLine();

            switch (money) {
                case 1 : 
                     System.out.println("Enter amount for deposit");
                     amount = scanner.nextDouble();
                     aciAccount.deposit(amount);

                     break;
                
                case 2: 
                    System.out.print("Enter amount for withdraw: ");
                    amount = scanner.nextDouble();
                    aciAccount.withdraw(amount);
                    break;

                case 3:
                    System.out.print("Currint Balance: " + aciAccount.getBalance());
                     break;
            
                default:
                    System.out.println("Invlid choice!");
                    break;
            }

         } while (money != 4);
         System.out.println("Thank you for using the bank system.");
            scanner.close();
        
    }
    
}
