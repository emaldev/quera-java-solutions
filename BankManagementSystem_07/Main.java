//This is a banking system built through 
// practice and design;
//  to design the classes myself, I first
//  sketch out my roadmap on paper and then begin coding.
package BankManagementSystem_07;

public class Main {
    public static void main(String[] args){

        Bank account = new Bank();
        account.addAccount("Milad", "456789002", 90);
        account.addAccount("Asef Habibi", "23456789", 899);
        account.searchAccount("milad");
        account.depositMoney("Milad", 100);
        account.withdrawMoney("Asef Habibi", 100);

        account.display();
        
    }
}
