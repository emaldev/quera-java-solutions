package OPP_04;

public class BMain {
    public static void main(String[] args){
        BankAccount aciAccount = new BankAccount("6078701801218394", "Ahmad", 234.890);
        BankAccount cAccount = new BankAccount("89034565432432", "Fatima", 345.90);

        aciAccount.deposit(1);
        aciAccount.displayInfo();
    }
    
}
