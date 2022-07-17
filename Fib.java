import java.util.*;

public class Fib {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("? ");
		int num = kb.nextInt();

        printFib(num);
		// call printFib() with num as argument
		
	}

	public static void printFib(int n) {
        if(n==1)
		 System.out.println("1");
		else if (n==2)
		 System.out.println("1,1");
		else{
         int[] f = new int[n];
         f[0] = 1;
		 f[1] = 1;
		 System.out.print("1,1");
		 for(int i=2;i<n;i++){
		 f[i] = f[i-1]+f[i-2];
		 System.out.print(","+f[i]);}

		}
        }
        



	}

