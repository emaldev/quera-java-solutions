package OPP_04;

public class StudentManager {
    
    private String name; 
    private int age; 
    private String studentId; 
    private double grade;

    public StudentManager(String name, int age, String studentId, double grade){
        this.name = name ;
        this.age =  age; 
        this.studentId = studentId;
        this.grade = grade;
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age 
            + ", ID: " + studentId + ", Grande: " + grade
        );
    }

    public void isPassed(){
        boolean Gfinal = false;
        if(grade >= 60){
          Gfinal = true;
          System.out.println("Good!");
        }
        if(!Gfinal){
            System.out.println("Not Bad");
        }
    }
}
