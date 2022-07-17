import java.util.Scanner;
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