package src;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        char last = 'E', alphabet = 'A';

        for(int i = 1; i <= (last-'A'+1); ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }
        Pattern p=new Pattern();
        p.pyramid();
        p.pyramid1();
    }
    public void pyramid() {
    	int rows = 5, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
    public void pyramid1() {
    	 Scanner sc = new Scanner(System.in);
         
         //Taking rows value from the user
          
         System.out.println("How many rows you want in this pattern?");
          
         int rows = sc.nextInt();
          
         System.out.println("Here is your pattern....!!!");
          
         //Printing upper half of the pattern
          
         for (int i = 1; i <= rows; i++) 
         {
             //Printing i spaces at the beginning of each row
              
             for (int j = 1; j < i; j++) 
             {
                 System.out.print(" ");
             }
              
             //Printing i to rows value at the end of each row
              
             for (int j = i; j <= rows; j++) 
             { 
                 System.out.print(j+" "); 
             } 
              
             System.out.println(); 
         }
         /*------------------------------------------------------------------------*/
         //Printing lower half of the pattern
         for (int i = rows-1; i >=1; i--) 
         {
             //Printing i spaces at the beginning of each row
              
             for (int j = 1; j < i; j++) 
             {
                 System.out.print(" ");
             }
              
             //Printing i to rows value at the end of each row
              
             for (int j = i; j <= rows; j++) 
             { 
                 System.out.print(j+" "); 
             } 
              
             System.out.println(); 
         } 
          
          
    }
}