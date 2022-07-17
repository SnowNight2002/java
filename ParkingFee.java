import java.util.Scanner;
/*
 * Write a Java program to calculate the parking fee based on the vehicle type and the hours a vehicle spent in a car park.
 * The parking fee is charged according to the table below. 
 * Private Car	15
 * Bus	35
 * Truck	50
 */
public class ParkingFee {
    public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);   
    int x,y;
    System.out.print( "Vehicle Type [1=private, 2=bus, 3=truck]?" );
    x = input.nextInt();     
    System.out.print( "Number of hours?" );
    y = input.nextInt();        
        
    switch (x) {
        case 1: 
         System.out.println("Parking fee = " + 15*y);
         break;
        case 2: 
          System.out.println("Parking fee = " + 35*y);
          break;
        
        case 3:         
         System.out.println("Parking fee = " + 50*y);        
         break;        
        default:
        System.out.println("404 error not found");  
        ;




    }
}
}
