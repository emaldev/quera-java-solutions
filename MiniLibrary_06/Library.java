package MiniLibrary_06;

import java.util.ArrayList;

public class Library {
    
    ArrayList<Book> book = new ArrayList<>();


    public void addBook(String title, String author){

        book.add(new Book(title, author));
    }

    public Book findBook(String title){
        for(Book b : book){
        if(b.getTitle().equalsIgnoreCase(title)){
           System.out.println(b.getTitle());
           b.borrow();
           return b;
        }
        
        }
        return null;
    }
}
