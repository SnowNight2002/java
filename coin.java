import java.util.Scanner;
/*
In Hong Kong, we have several kinds of coins, 
i.e. 10-dollar, 5-dollar, 2-dollar, and 1-dollar coins.
Write a Java program to let users input an amount,
and then calculate the minimum number of coins for corresponding amounts of dollars.  
An example execution is shown below.
 */

public class coin {
   public static void main( String[] args ) {
      // Create a Scanner object for console input
      Scanner input = new Scanner(System.in);
      
      // Declare variables
      int amount,ten,five,two,one;


      System.out.print( "Input an amount:" );
      amount = input.nextInt();
      ten = amount/10;
      amount = amount%10;
      five = amount/5;
      amount = amount%5;
      two = amount/2;
      amount = amount%2;
      one = amount/1;
      amount = amount%1;
      System.out.println("10-dollar coin(s):"+ ten);
      System.out.println("5-dollar coin(s):"+ five);
      System.out.println("2-dollar coin(s):"+ two);
      System.out.println("1-dollar coin(s):"+ one);
   } 
}
 