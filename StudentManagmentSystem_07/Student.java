package StudentManagmentSystem_07;

public class Student {
    private String name;
    private int age;
    private int id;

    // Creat a constractor.
    public Student(String name , int age, int id){
        this.name = name; 
        this.age = age;
        this.id = id;
    }

    // Creat getter for return methods.
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    
}
