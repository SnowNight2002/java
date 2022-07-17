import java.util.Scanner;
/*
even numbered streets are east-bound, odd numbered streets are west-bound. 
Write a Java program to accept a street number from the user and print a message on screen to tell the user the direction. 
*/
public class NYC {
   public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    int x;
    System.out.print( "Street number? " );
    x = input.nextInt(); 

    if(x%2 == 0)
     System.out.println("east-bound");
    else 
    
     System.out.println("west-bound");






}}
