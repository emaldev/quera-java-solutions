public class MainA {
    public static void main(String[] args){

        AnimalManagement anima = new AnimalManagement("Dog", 2);
        anima.makeSound();

        DogA dog = new DogA("Ascobi 2", 2);
        dog.makeSound();
        CatA cat = new CatA("Jery", 4);
        cat.makeSound();
    }
    
}
