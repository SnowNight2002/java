import java.util.*;
public class CheckPrime {
	public static void main(String [ ] args) {
		int num;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a number: ");
		
		num = kb.nextInt();	
		if (isPrime(num))
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for (int i=2; i<n; i++) {
			if (n%i == 0)   	// divisible by i
				isPrime = false;    // not a prime
		}

		if (isPrime)
         return true;
        else 
         return false;
		
//		System.out.println(num + " is " + (isPrime?"":"not ") + "a prime number.");
	}
}
