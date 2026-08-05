package BankManagementSystem_07;

import java.util.ArrayList;

public class Bank {
    
    ArrayList<Account> bank = new ArrayList<>();

    // this is a method of add a new account in the bank
    public void addAccount(String name, String accountNumber, float balance){
        bank.add(new Account(name, accountNumber, balance));
    }

    public void display(){
        for(Account A : bank){
            A.displayInfo();
        }
    }
    // this is diposit method 
    public void depositMoney(String name , float amount){
        Account account = searchAccount(name);

        if(account != null){
            account.deposit(amount);
        }
    }

    // this is the withdras money method
    public void withdrawMoney(String name , float amount){
        Account account = searchAccount(name);

        if(account != null){
            account.withdrawal(amount);
        }
    }


    // this is search method for bank.

    public Account searchAccount(String name ){
        for(Account A : bank){
            if(A.getName().equalsIgnoreCase(name)){
                return A;
            }
        }
        System.out.println("Not found!");
        return null;

    }
}
