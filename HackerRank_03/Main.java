package HackerRank_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 1; i++){
            System.out.println("Enter the student's name, age, and grade: " + (i + 1));

            String name = input.nextLine();
            int age = input.nextInt();
            double gpa = input.nextDouble();
            

            System.out.println("+++++++++++++++++++++++");
            System.out.printf("Name: %-15s%nAge:%5d %nGPA: %.2f%n ", name, age, gpa);
            System.out.println("+++++++++++++++++++++++");
        }
        // If you find this project useful, consider giving it a ⭐ and following me on GitHub.

        
    }
}
