package HackerRank_03;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for(int i = 0; i < t; i++){       
          int a = input.nextInt();
          int b = input.nextInt();
          int n = input.nextInt();
          int sum = a;
          for(int j = 0; j < n; j++){
            sum += (int)(b * Math.pow(2,j));
             System.out.println(sum + " ");
             System.out.println();
          }
          
        }
        
    }
}
