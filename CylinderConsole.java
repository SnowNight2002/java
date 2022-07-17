import java.util.*;
public class CylinderConsole {
    public static void main( String[] args ) {
       
        Scanner input = new Scanner(System.in);
        double radius,length,volume;

        System.out.print("Enter the radius:");
        radius = input.nextDouble();
        System.out.print( "Enter length: " );
        length = input.nextDouble();  // input an integer from keyboard

        volume = radius*radius*Math.PI*length;


        System.out.printf(
        "The volume of the cylinder with radius=%5.1f"
        +
        "and length=%5.1f \nis%7.2f."
        ,radius,length,volume

        );


       }
    }
