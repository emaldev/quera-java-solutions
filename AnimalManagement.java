public class AnimalManagement {
    private String name;
    private int age;

    public AnimalManagement(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void makeSound(){
        System.out.println("Animal makes a suond.");
    }
}
