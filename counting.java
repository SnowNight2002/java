import java.util.Scanner;
public class m {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
       double sum=0;
       double n=0;
       double x ,Max=0,Min=0;
       System.out.print( "How many number Do you want to input? " );
       int r;
       r = input.nextInt();
       double[] values= new double[r]; 
       for(int j=0;j<values.length;j++){
       System.out.print( "Enter value? " );
       x= input.nextDouble(); 

      // if (x<0){ break;}
        
       values[j] =x;
       sum += values[j];
       n++;
 }
       Max = values[0];
       Min = values[0];

       for(int i=1;i<values.length;i++){
        //if (x>Max){Max=x;}
        if (values[i]>Max)
         Max = values[i];
        //if (x<Min){Min=x;}  
        if (values[i]<Min)
         Min = values[i];
}         
    System.out.printf( "Sum=%.2f",sum);
    System.out.println();
    System.out.printf("Mean=%.2f",sum/n);
    System.out.println();
    System.out.println("Maximum="+Max);
    System.out.println("Maximum="+Min);
}
}