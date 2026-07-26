package Generics_02.HackerRank_03;

import java.util.Scanner;

public class InputFramting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        int number;
        for(int i = 0; i < 3; i++){
            System.out.println("\n Enter the book name of numbers : " + (i + 1));

             name = input.nextLine();
             number = input.nextInt();
            input.nextLine();

            System.out.printf("%-15s%03d", name , number );
            
        }

        
        
    }
}
