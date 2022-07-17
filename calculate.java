import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class calculate {
 public static void main( String[] args ) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x (in radians): ");
        double x = scn.nextDouble();

        double value = 0;
        double term;

        for (int i = 1; i <= 14; i++) {   //loop
            int y = (i-1) * 2 +1;   // 1,3,5,7,9
            
            term = Math.pow(x, y)*(Math.pow(-1, (i-1)));   //分子  x^(y) * 每次loop變化的 " - " or " + "
            for (; y > 1;y--){
                term /= y; // if is x^(3)/3! then will be --> loop 1:x^(3)/3 ,loop 2:x^(3)/2. and then y=1 so putout
                // System.out.print(term+"  ");
            }
            
            System.out.printf("Term %d = %e\n", i, term);
            value += term;
        }
        System.out.printf("Sin(%.1f)=%f\n", x, value);  // sin(x)=value
    }
    
}