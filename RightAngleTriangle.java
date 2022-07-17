import java.util.Scanner;
public class RightAngleTriangle {
    public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Side a:");
        int a = kb.nextInt();
		System.out.println("Side b:");
		int b = kb.nextInt();
		System.out.println("Side c:");
        int c = kb.nextInt();
   
      if(isRightAngleTriangle(a,b,c))
      System.out.println("The triangle is a right-angle triangle.");
      else
      System.out.println("The triangle is not a right-angle triangle.");
   
   
   
    }

public static Boolean isRightAngleTriangle(int a,int b,int c) {
    if(a*a==b*b+c*c)
     return true;
    else if (b*b==a*a+c*c)
     return true;
    else if (c*c==b*b+a*a)
     return true;
    else 
     return false;
}

}