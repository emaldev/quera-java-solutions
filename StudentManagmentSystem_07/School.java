package StudentManagmentSystem_07;

import java.util.ArrayList;

public class School{

    ArrayList<Student> students = new ArrayList<>();

    // this method is for add a new student in the school.
    public void addStudent(String name, int age, int id){
        students.add(new Student(name, age, id));
    }

    public Student findStudent(String name){
        for(Student s: students){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("find students: " + s.getName());
                return s;
            }
         
        }
        System.out.println("Student not find the school.");
        return null;
        
    }

    public void showStudent(){
        for(Student s : students){
            s.displayStudent();
        }

    }


}
