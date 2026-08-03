package CinemaManagement_08;

import java.util.ArrayList;

public class Cinema {
    ArrayList<Film> film = new ArrayList<>();

    // this is for adding a new film for cinema.
    public void addFile(String name, String directory, String country, int production_year){
       film.add(new Film(name, directory, country, production_year));
    }

    public Film selectFilm(String name){
        for(Film f : film){
            if(f.getName().equalsIgnoreCase(name));{
            System.out.println("This is your Preferred file: " + f.getName());
            return f;
            }
        }
        return null;
    }


    
}
