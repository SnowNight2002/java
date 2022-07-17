import java.util.Scanner;
public class LDLC {
   public static void main( String[] args ) {
      // Create a Scanner object for console input
      Scanner input = new Scanner(System.in);
      
      // Declare variables
      int tc,hdlc,tg;
      double ldlc;



      System.out.print( "Enter TC: " );
      tc = input.nextInt();  // input an integer from keyboard
      System.out.print( "Enter HDLC: " );
      hdlc = input.nextInt();  // input an integer from keyboard
      System.out.print( "Enter TG: " );
      tg = input.nextInt();  // input an integer from keyboard
      
      ldlc = tc - hdlc - (double)tg/5;

      System.out.println("LDLC ="+ ldlc);
   } 
}
