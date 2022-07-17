import java.util.Scanner;
public class ExamGrade {
    public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);   
    double x;
    System.out.print( "Exam mark? " );
    x = input.nextDouble();

    
    if(x>=90)
     System.out.println("Grade = A");
    else if (x>=80) 
     System.out.println("Grade = B");
    else if (x>=70) 
     System.out.println("Grade = C");
    else if (x>=60) 
     System.out.println("Grade = D");
    else if (x>=0) 
     System.out.println("Grade = F");
    else 
     System.out.println("404 error not found");

}
}