package BankManagementSystem_07;

public class Account {
    private String name;
    private String acountNumber;
    private float balance;

    // make a constractor here 
    public Account(String name, String acountNumber, float invertory ){
        this.name = name;
        this.acountNumber = acountNumber;
        this.balance = invertory;
    }

    public String getName(){
        return name;
    }
    public String getAccountNumber(){
        return acountNumber;
    }
    public float getBalance(){
        return balance;
    }


    // display acount 
    public void displayInfo(){
        System.out.println("Name :" + name + ", Acount Number :" + acountNumber + ", Inventory : " + balance );

    }

    // this is the inventory method .
    public void deposit(float amount){
        balance += amount;
        System.out.println("The payment has been made." + "{"+  balance + "}");
    }

    public void withdrawal(float  amount){

        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawal successful .");
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance : " + balance);
        }else{
            System.out.println("Insufficient funds!");
        }
    }



    
}
