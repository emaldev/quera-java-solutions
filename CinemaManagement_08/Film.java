package CinemaManagement_08;

public class Film {
    private String name;
    private String director;
    private String country;
    private int production_year;

    // make a constractor for film deta.

    public Film(String name, String directory, String country, int production_year){
        this.name = name;
        this.director = directory;
        this.country = country;
        this.production_year = production_year;

    }

    // Creat getter for all variable
    public String getName(){
        return name;
    }
    public String getDirectory(){
        return director;
    }
    public String getCountry(){
        return country;
    }
    public int getProducionYear(){
        return production_year;
    }

    public void displayInfo(){
        System.out.println("File Name: " + name + ", Directory: " + director 
         + ", Country: " + country + ", Production Year : " + production_year
        );
    }

    
}
