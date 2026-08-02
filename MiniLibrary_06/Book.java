package MiniLibrary_06;

public class Book {
    private String title;
    private String author;
    boolean available;

    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }

 

    public void displayInfor(){
        System.out.println("Title: " + title + ", Author: " + author + ", Available : " + available)
    }

    public boolean borrow(){
        if(available){
            available = false;
            return true;
        }
        return false;
    }

    
}
