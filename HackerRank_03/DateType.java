package HackerRank_03;

import java.util.Scanner;

public class DateType {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number :");
        String  number = input.nextLine();
        long num = long.parseInt(number); // change to Integer number .
        System.out.println("Enter the test number :");
        int t = 0;
        for(int i = 0; i < t; i++){
            if(num >= -128 && num <= 127){
                System.out.println("* Byte");
            }if (num >= -32768 && num <= 23768){
                System.out.println("* short ");
            }if(num >= -2147483648 && num <= 2147483648){
                System.out.println("* int");
            }
          
        }
        
    }
}
