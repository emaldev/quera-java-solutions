package HackerRank_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Ente 3 name  ane price : " + (i + 1));

            String name = input.nextLine();
            int prince = input.nextInt();
            input.nextLine();

            System.out.printf("%-15s%05d%n", name, prince);
        }

        
    }
}
