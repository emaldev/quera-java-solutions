package MiniLibrary_06;

public class Main {
    public static void main(String[] args){

        Library L = new Library();
        L.addBook("Java Basics", "Emal");
        L.addBook("C++ Basics", "Mild");
    

        Book book = L.findBook("Java Basics");
       
        if(book != null){
            book.displayInfor();
        }
    }
    
}
