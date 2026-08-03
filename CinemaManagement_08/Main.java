package CinemaManagement_08;

public class Main {
    public static void main(String[] args){

        Cinema cinema = new Cinema();
        cinema.addFile("War", "Micle", "Amirican", 2013);
        cinema.addFile("Dragon", "Malika", "Farance", 2010);

        cinema.searchFilm("Dragon");
        cinema.searchFilm("War");
        cinema.showFilm();
    }
    
}
