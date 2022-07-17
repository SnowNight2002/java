import java.util.Scanner;
public class RandomList {
    public static void main( String[] args ) { 
        int sum=0;

        Scanner input = new Scanner(System.in);
        System.out.print( "Number of random numbers: " );
        int n = input.nextInt(); 
        for (int i=0;i<=n;i++){
        int rand = (int) (Math.random() * 100);
        System.out.println( rand );
        sum += rand;

        }
        System.out.print( "Sum="+sum );

    }
}
