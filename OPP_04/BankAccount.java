package OPP_04;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
   
    public String getOwnerName(){
        return ownerName;
    }
   
    public double  getBalance(){
        return balance;
    }
   

    public double deposit(double amount){
        balance += amount ;
        return balance;

    }

    public double withdraw(double amount){
       
       if(balance >= amount){
           balance -= amount;
             
            System.out.println("Withdrawal successful.");
        }else {
            System.out.println("Insufficient balance.");
        }
         
        return balance;
    }

    public void displayInfo(){
        System.out.println(
               "Account Number: " + accountNumber + 
               ", Owner Name: " + ownerName +
               ", Balance: " + balance
        );
    }

}
