package BankManagementSystem_07;

public class Acount {
    private String name;
    private String acountNumber;
    private float inventory;

    public Acount(String name, String acountNumber, float invertory ){
        this.name = name;
        this.acountNumber = acountNumber;
        this.inventory = invertory;
    }


    public void displayInfo(){
        System.out.println("Name :" + name + ", Acount Number :" + acountNumber + ", Inventory : " + inventory );

    }
    

    
}
