package StudentManagmentSystem_07;

public class Main {
    public static void main(String[] args){
        
        School school = new School();
    
        school.addStudent("Ali", 21, 3456);
        school.addStudent("Milad", 23, 1568);

        school.findStudent("Milad");
        school.showStudent();

    }
    
}
