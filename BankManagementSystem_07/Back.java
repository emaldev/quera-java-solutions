package BankManagementSystem_07;

import java.util.ArrayList;

public class Back {
    
    ArrayList<Account> bank = new ArrayList<>();

    // this is a method of add a new account in the bank
    public void addAccount(String name, String accountNumber, float balance){
        bank.add(new Account(name, accountNumber, balance));
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
