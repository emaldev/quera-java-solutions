package BankManagementSystem_07;

public class Main {
    public static void main(String[] args){

        Bank account = new Bank();
        account.addAccount("Milad", "456789002", 90);
        account.searchAccount("milad");
        
    }
}
