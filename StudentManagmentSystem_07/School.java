package StudentManagmentSystem_07;

import java.util.ArrayList;

public class School{

    ArrayList<Student> students = new ArrayList<>();

    // this method is for add a new student in the school.
    public void addStudents(String name, int age, int is){
        students.add(new Student(name, age, is));
    }

    public Student foundStudents(String name){
        for(Student s: students){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("Fint students: " + s.getName());
                return s;
            }else{
                System.out.println("Student not found the school.");
            }
            
        }
        return null;
    }

    
}
