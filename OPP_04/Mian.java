package OPP_04;

public class Mian {
    public static void main(String[] args){
        StudentManager student = new StudentManager("Ali", 21, "2345", 50.0);
        StudentManager student1 = new StudentManager("Milad Azimi", 24, "1246", 70.05);

        student.displayInfo();
        student1.displayInfo();

        student.isPassed();
        student1.isPassed();
    }
    
}
