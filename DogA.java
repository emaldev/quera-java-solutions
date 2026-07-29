public class DogA extends AnimalManagement {

    public DogA(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
       
        System.out.println("Dog barks");
    }
    
    
}
