public class Book {
    private String title; 
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author; 
        this.price = price;
        
    }

    public boolean getIsAvalable(){
        return isAvailable;
    }

     public boolean isAvailable(){
        if(isAvailable){
            System.out.println("Book borrowed successfully.");

        }else{
            System.out.println("Book is not available.");
        }
     }
}
